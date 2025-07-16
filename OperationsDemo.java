public class OperationsDemo {

    public static void main(String[] args) {

        int a = 12, b = 5;
        System.out.println("a = " + a + ",  b = " + b);

        /* -------- Arithmetic -------- */
        System.out.println("Addition          : " + (a + b));   // 17
        System.out.println("Subtraction       : " + (a - b));   // 7
        System.out.println("Multiplication    : " + (a * b));   // 60
        System.out.println("Division (int)    : " + (a / b));   // 2
        System.out.println("Modulus           : " + (a % b));   // 2
        System.out.println("Increment (++a)   : " + (++a));     // 13
        System.out.println("Decrement (--b)   : " + (--b));     // 4

        /* -------- Relational -------- */
        System.out.println("\nRelational (a > b)  : " + (a > b));
        System.out.println("Relational (a == 13): " + (a == 13));

        /* -------- Logical -------- */
        boolean x = true, y = false;
        System.out.println("\nLogical AND  (x && y): " + (x && y));
        System.out.println("Logical OR   (x || y): " + (x || y));
        System.out.println("Logical NOT    (!x) : " + (!x));

        /* -------- Bitwise -------- */
        System.out.println("\nBitwise AND  (a & b) : " + (a & b));  // 13 & 4
        System.out.println("Bitwise OR   (a | b) : " + (a | b));  // 13 | 4
        System.out.println("Left‑shift   (a << 1): " + (a << 1)); // 26

        /* -------- Ternary -------- */
        int max = (a > b) ? a : b;
        System.out.println("\nTernary → Max of a and b = " + max);
    }
}
