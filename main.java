import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();

            int stringLength = sentence.length();
            int spaceCount = 0;
            for (char c : sentence.toCharArray()) {
                if (Character.isWhitespace(c)) {
                    spaceCount++;
                }
            }
            System.out.println("Total number of chars are : " + stringLength);
            System.out.println("Total number of space-bars are " + spaceCount);

            System.out.println("Do you want to repeat? ");
            String response = scanner.nextLine().toLowerCase();
            repeat = response.equals("yes");
        }
    }
}