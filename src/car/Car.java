package car;

public  abstract class Car {
    /*
    car.Car деген класс тузунуз
Полялары: model, colour, maxSpeed.
Конструктор, Getter Setter жана эки abstractный метод
тузунуз gas() жана brake().
2 subClass тузуп, super класстын методдорун реализация
кылыныз
Саб класстарга 2 ден объект тузуп, методдорун
иштетиниз.
     */
    private String model;
    private String colour;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, int maxSpeed, String colour) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    public abstract void gas();
    public abstract void brake();

    @Override
    public String toString() {
        return "Car{" +
                " colour= '" + colour + '\'' +
                ",   model= '" + model + '\'' +
                ",   maxSpeed= " + maxSpeed +
                '}';
    }
}