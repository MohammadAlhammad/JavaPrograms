import java.util.*;

public class TypingTest {
    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean isRestarted = false;

    public static void main(String[] args) {
        System.out.println("Welcome to Keyboard Typing Test!");

        while (true) {
            playGame();

            System.out.print("\nDo you want to restart the game? (y/n): ");
            String restartChoice = scanner.nextLine().toLowerCase();

            if (restartChoice.equals("y") || restartChoice.equals("yes")) {
                isRestarted = true;
            } else {
                break;
            }
        }

        System.out.println("\nThank you for playing! Goodbye.");
        scanner.close();
    }

    public static void playGame() {
        System.out.println("\nLevel 1: Type the alphabet");
        System.out.println("Type each letter of the alphabet in order. Press Enter after each letter.");
        

        long startTimeLevel1 = System.currentTimeMillis();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(alphabet.toUpperCase() + ": ");
        String userTypedAlphabet = scanner.nextLine().toLowerCase();
        long endTimeLevel1 = System.currentTimeMillis();

        int correctCountLevel1 = countCorrectCharacters(alphabet, userTypedAlphabet);
        int totalCharactersLevel1 = alphabet.length();
        int accuracyLevel1 = calculateAccuracy(correctCountLevel1, totalCharactersLevel1);
        long durationLevel1 = endTimeLevel1 - startTimeLevel1;
        int typingSpeedLevel1 = calculateTypingSpeed(correctCountLevel1, durationLevel1);

        System.out.println("\nLevel 1 Results:");
        System.out.println("Accuracy: " + accuracyLevel1 + "%");
        System.out.println("Typing Speed: " + typingSpeedLevel1 + " characters per minute");

        if (isRestarted) {
            isRestarted = false;
            return;
        }

        System.out.println("\nLevel 2: Type random words");
        System.out.println("Type each word shown below. Press Enter after each word.");
       

        long startTimeLevel2 = System.currentTimeMillis();
        String[] randomWords = generateRandomWords(12);
        int correctCountLevel2 = 0;

        for (String word : randomWords) {
            System.out.print(word + ": ");
            String userTypedWord = scanner.nextLine().toLowerCase();
            correctCountLevel2 += countCorrectCharacters(word, userTypedWord);
        }

        long endTimeLevel2 = System.currentTimeMillis();
        int totalCharactersLevel2 = getTotalCharacters(randomWords);
        int accuracyLevel2 = calculateAccuracy(correctCountLevel2, totalCharactersLevel2);
        long durationLevel2 = endTimeLevel2 - startTimeLevel2;
        int typingSpeedLevel2 = calculateTypingSpeed(correctCountLevel2, durationLevel2);

        System.out.println("\nLevel 2 Results:");
        System.out.println("Accuracy: " + accuracyLevel2 + "%");
        System.out.println("Typing Speed: " + typingSpeedLevel2 + " characters per minute");

        if (isRestarted) {
            isRestarted = false;
            return;
        }

        System.out.println("\nLevel 3: Type a specific sentence");
        System.out.println("Type the following sentence: 'Thank you Mohammad Alhammad for this awesome game'. Press Enter after typing.");
        

        long startTimeLevel3 = System.currentTimeMillis();
        String sentence = "Thank you Mohammad Alhammad for this awesome game";
        System.out.print(sentence + ": ");
        String userTypedSentence = scanner.nextLine().toLowerCase();
        long endTimeLevel3 = System.currentTimeMillis();

        int correctCountLevel3 = countCorrectCharacters(sentence, userTypedSentence);
        int totalCharactersLevel3 = sentence.length();
        int accuracyLevel3 = calculateAccuracy(correctCountLevel3, totalCharactersLevel3);
        long durationLevel3 = endTimeLevel3 - startTimeLevel3;
        int typingSpeedLevel3 = calculateTypingSpeed(correctCountLevel3, durationLevel3);

        System.out.println("\nLevel 3 Results:");
        System.out.println("Accuracy: " + accuracyLevel3 + "%");
        System.out.println("Typing Speed: " + typingSpeedLevel3 + " characters per minute");

        // Display message based on accuracy level
        if (accuracyLevel3 >= 85) {
            System.out.println("\nGood job buddy!");
        } else {
            System.out.println("\nYou have to work more on yourself.");
        }
    }

    public static int countCorrectCharacters(String original, String typed) {
        int count = 0;
        int minLength = Math.min(original.length(), typed.length());

        for (int i = 0; i < minLength; i++) {
            if (Character.toLowerCase(original.charAt(i)) == Character.toLowerCase(typed.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static int calculateAccuracy(int correctCount, int totalCharacters) {
        return (int) (((double) correctCount / totalCharacters) * 100);
    }

    public static int calculateTypingSpeed(int correctCount, long duration) {
        double minutes = duration / 1000.0 / 60.0;
        return (int) (correctCount / minutes);
    }

    public static int getTotalCharacters(String[] words) {
        int count = 0;

        for (String word : words) {
            count += word.length();
        }

        return count;
    }

    public static String[] generateRandomWords(int count) {
        String[] words = {
            "hello", "world", "java", "programming", "computer", "keyboard", "mouse", "monitor", "internet", "code", "game", "open", "close", "read", "write"
        };

        List<String> randomWords = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(words.length);
            randomWords.add(words[randomIndex]);
        }

        return randomWords.toArray(new String[0]);
    }
}







