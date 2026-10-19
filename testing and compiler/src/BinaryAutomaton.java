
import java.util.Scanner;

public class BinaryAutomaton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String input = scanner.nextLine();

        int state = 0; // q0 is the starting state

        for (char symbol : input.toCharArray()) {
            if (symbol != '0' && symbol != '1') {
                System.out.println("Invalid input!");
                scanner.close();
                return;
            }

            if (symbol == '0') {
                state = 0; // Move to q0
            } else {
                state = 1; // Move to q1
            }
        }

        if (state == 1) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }

        scanner.close();
    }
}
