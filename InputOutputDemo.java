import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) throws IOException {

        /* ---------- 1. WITH Scanner ---------- */
        Scanner sc = new Scanner(System.in);
        System.out.print("Scanner → Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Scanner → Enter your age: ");
        int age = sc.nextInt();

        System.out.printf("Hello %s, you are %d years old.%n%n", name, age);

        /* ---------- 2. WITHOUT Scanner (classic Java I/O) ---------- */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("BufferedReader → What city do you live in? ");
        String city = br.readLine();

        System.out.print("BufferedReader → What is your PIN code? ");
        int pin = Integer.parseInt(br.readLine());

        System.out.println("\nYou live in " + city + " (PIN " + pin + ").");

        /* ---------- 3. Pure Output (no input) ---------- */
        System.out.println("\nPrinting some unicode: ☕ → Java is fun!");
        sc.close();          // Always close Streams/Scanners you open
        br.close();
    }
}
