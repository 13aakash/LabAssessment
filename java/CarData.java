class Car {
    String color;
    int speed;

    void start() {
        System.out.println("Car is starting...");
    }
}

public class CarData {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.speed = 120;
        myCar.start();
        System.out.println("Color: " + myCar.color);
        System.out.println("Speed: " + myCar.speed + " km/h");
    }
}
