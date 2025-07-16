/* ---------- 1. Abstract base (cannot be instantiated) ---------- */
abstract class Shape {
    /* default (package‑private) modifier below */
    double area;                       // visible to same package

    /* abstract → subclass must give a body */
    abstract void calculateArea();

    /* final → cannot be overridden further */
    public final void printArea() {
        System.out.println("Area = " + area);
    }
}

/* ---------- 2. Concrete subclass ---------- */
class Circle extends Shape {
    private double radius;             // private → only Circle

    /* static field → common to *all* circles */
    static final double PI = 3.14159;  // final & static

    Circle(double radius) {
        this.radius = radius;
    }

    /* public method overriding Shape.calculateArea() */
    @Override
    public void calculateArea() {
        area = PI * radius * radius;
    }

    /* protected helper → visible to subclasses & same package */
    protected double getRadius() {
        return radius;
    }
}

/* ---------- 3. Main driver class ---------- */
public class AccessModifiersDemo {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.calculateArea();
        c.printArea();      // uses final method from Shape
        // System.out.println(c.radius); // ← compile error (private)
        System.out.println("Radius (via protected getter) = " +
                           c.getRadius());
    }
}
