package car;

public class Toyota extends Car {

    public Toyota() {
    }

    public Toyota(String model, int maxSpeed, String colour) {
        super(model, maxSpeed, colour);
    }

    @Override
    public void gas() {
        System.out.println("Toyota is going");
    }

    @Override
    public void brake() {
        System.out.println("Toyota stopped");
    }
}