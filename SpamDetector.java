import java.util.*;

public class SpamDetector {

    static String[] spamWords = {
            "win", "free", "offer", "click", "buy now",
            "subscribe", "urgent", "money", "prize"
    };

    public static boolean isSpam(String message) {
        message = message.toLowerCase();
        int score = 0;

        for (String word : spamWords) {
            if (message.contains(word)) {
                score++;
            }
        }

        // Threshold logic
        return score >= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your message/email:");
        String message = sc.nextLine();

        boolean result = isSpam(message);

        if (result) {
            System.out.println("⚠️ This message is SPAM!");
        } else {
            System.out.println("✅ This message is NOT spam.");
        }

        sc.close();
    }
}