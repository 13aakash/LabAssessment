class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class MethodParamDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("Sum: " + result);
    }
}
