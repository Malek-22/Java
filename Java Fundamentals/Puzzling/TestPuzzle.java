import java.util.Arrays;

public class TestPuzzle {
    public static void main(String[] args) {
        Puzzle generator = new Puzzle();

        System.out.println("Random Rolls: " + generator.getTenRolls());
        System.out.println("Random Letter: " + generator.getRandomLetter());
        System.out.println("Generated Password: " + generator.generatePassword());

        String[] passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Password Set: " + Arrays.toString(passwordSet));

        int[] arrayToShuffle = { 1, 2, 3, 4, 5, 6, 7, 8 };
        generator.shuffleArray(arrayToShuffle);
        System.out.println("Shuffled Array: " + Arrays.toString(arrayToShuffle));
    }
}