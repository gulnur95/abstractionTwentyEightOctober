package car;

public class Lexus  extends Car {

    public Lexus() {
    }

    public Lexus(String model, int maxSpeed, String color) {
        super(model, maxSpeed, color);
    }

    @Override
    public void gas() {
        System.out.println("Lexus is going");
    }

    @Override
    public void brake() {
        System.out.println("Lexus stopped");
    }


}
