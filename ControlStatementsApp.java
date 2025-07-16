import java.util.Random;
import java.util.Scanner;

public class ControlStatementsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();

        MENU:                   // ← jump label for break demo
        while (true) {          // outer infinite loop
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Play Game");
            System.out.println("2. Help");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> playGame(sc, rng);     // iteration & methods
                case 2 -> System.out.println("Guess a number 1‑10 in 3 tries.");
                case 3 -> { System.out.println("Bye!"); break MENU; } // jump
                default -> System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }

    /* do‑while loop inside the mini‑game */
    private static void playGame(Scanner sc, Random rng) {
        int target = rng.nextInt(10) + 1;
        int attempts = 0;
        boolean win = false;

        do {
            System.out.print("Guess (1‑10): ");
            int guess = sc.nextInt();
            attempts++;

            if (guess == target) {      // if‑else
                win = true;
                break;                  // break inner loop
            } else if (guess < target) {
                System.out.println("Higher!");
            } else {
                System.out.println("Lower!");
            }

            if (attempts == 3) continue;   // continue to next iteration

        } while (attempts < 3);            // do‑while

        System.out.println(win ? "You win!" : "Out of tries. Number was " + target);
    }
}
