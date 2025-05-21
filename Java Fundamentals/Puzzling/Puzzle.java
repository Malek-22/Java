import java.util.Random;
import java.util.ArrayList;

public class Puzzle {
    public ArrayList<Integer> getTenRolls() {
        Random rand = new Random();
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(20) + 1);
        }
        return rolls;
    }

    public char getRandomLetter() {
        Random rand = new Random();
        char[] alphbet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return alphbet[rand.nextInt(26)];
    }

    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    public void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}