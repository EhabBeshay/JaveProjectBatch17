package Class26;

public class Task6Project {
    public static char findFirstNonRepeatingChar(String str) {
        for (char currentChar : str.toCharArray()) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (currentChar == c) {
                    count++;
                }
            }
            if (count == 1) {
                return currentChar;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        char firstNonRepChar = findFirstNonRepeatingChar("abracadabra");
        if (firstNonRepChar != 0) {
            System.out.println("The first non-repeating character is: " + firstNonRepChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
