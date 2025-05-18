import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreetingAuto(String name) {
        String timePeriod;
        int hour = new Date().getHours();

        if (hour < 12) {
            timePeriod = "morning";
        } else if (hour < 18) {
            timePeriod = "afternoon";
        } else {
            timePeriod = "evening";
        }

        return String.format("Good %s, %s. Lovely to see you.", timePeriod, name);
    }

    // Date Announcement
    public String dateAnnouncement() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
        return "It is currently " + formatter.format(new Date()) + ".";
    }

    // Respond Before Alexis
    public String respondBeforeAlexis(String conversation) {
        if (conversation.toLowerCase().contains("alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.toLowerCase().contains("alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // Dramatic Alfred Quotes
    public String dramaticAnnouncement(String message) {
        return message.toUpperCase() + "!!!";
    }
}