public class AlfredTest {

    public static void main(String[] args) {

        AlfredQuotes alfredBot = new AlfredQuotes();

        // Basic Greeting Test
        System.out.println(alfredBot.basicGreeting());

        // Guest Greeting Test
        System.out.println(alfredBot.guestGreeting("Beth Kane"));

        // Date Announcement Test
        System.out.println(alfredBot.dateAnnouncement());

        // Respond Before Alexis Test
        System.out.println(alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats."));
        System.out.println(alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is."));
        System.out.println(alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing.."));

        // Guest Greeting Overloaded Test
        System.out.println(alfredBot.guestGreeting("Beth Kane", "evening"));
        System.out.println(alfredBot.guestGreetingAuto("Beth Kane"));

        // Sensei Bonus Test
        System.out.println(alfredBot.dramaticAnnouncement("Master Wayne, we must act fast"));
    }
}