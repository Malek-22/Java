import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("Umbrella - Rihanna", "You can stand under my umbrella, ella, ella, eh, eh, eh...");
        trackList.put("Someone Like You - Adele", "Never mind, I'll find someone like you...");
        trackList.put("Shape of You - Ed Sheeran", "I'm in love with the shape of you...");
        trackList.put("Blinding Lights - The Weeknd", "I said, ooh, I'm blinded by the lights...");

        String lyrics = trackList.get("Blinding Lights - The Weeknd");
        System.out.println("Lyrics for 'Blinding Lights - The Weeknd': " + lyrics);

        System.out.println("\nAll tracks with lyrics:");
        for (HashMap.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
