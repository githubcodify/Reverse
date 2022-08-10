import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String[] textArray = scanner.nextLine().split(" ");
        for (int i = 0; i < textArray.length; i++) {
            text += new StringBuilder().append(textArray[i]).reverse() + " ";
        }
        System.out.println("Reversed: " + text);
    }
}
