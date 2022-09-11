

public class CarTest {
    public static void main(String[] args) {
        Car tesla = new Car("Model 3", "Red");

        System.out.println("My car model is" + tesla.model + "and" + "color is " + tesla.color + "입니다.");
        tesla.power();
        tesla.accelerate();
        tesla.stop();
    }
}

class Car {
    public String model;
    public String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }


    void power() {
        System.out.println("power On");
    }

    void accelerate() {
        System.out.println("more fast!");
    }

    void stop() {
        System.out.println("Stop!!");
    }
}