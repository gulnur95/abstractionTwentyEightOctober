import animal.*;
import car.Car;
import car.Lexus;
import car.Toyota;
import shape.*;

public class Main {

    public static void main(String[] args) {

        /*    Task     LMS      Abstraction
        public abstract double getPerimeter() деген абстракт методун  shape.Shape деген класска кошунуз.
         Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.
         */

        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(2, 4);
        Shape square = new Square(2);
        Shape triangle = new Triangle(5,4,5);
        Shape pentagon = new Pentagon(2);


        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        System.out.println("Square Perimeter: " + square.getPerimeter());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
        System.out.println("Pentagon Perimeter: " + pentagon.getPerimeter());









        //  Task  2      Abstraction
//        Animal[] animals1 = {
//                new Sheep("Sheep 1", 2, "female", 65),
//                new Sheep("Sheep 2", 3, "male", 68),
//                new Sheep("Sheep 3", 4, "female", 69),
//                new Cow("Cow 1", 2, "female", 125),
//                new Cow("Cow 2", 3, "male", 128),
//                new Cow("Cow 3", 4, "female", 129),
//                new Cow("Cow 4", 2, "female", 165),
//                new Cow("Cow 5", 3, "male", 168),
//                new Horse("Horse 1", 2, "female", 165, "white"),
//                new Horse("Horse 2", 3, "male", 168, "black"),
//        };
//
//        Farm farm = new Farm(animals1, "Walk Street 23", "Jack Kendal");
//
//        System.out.println(farm);
//
//        Animal[] animals2 = {
//                new Sheep("White Sheep", 2, "female", 56),
//                new Cow("Brown Cow ", 2, "female", 115),
//                new Horse("Blue Horse ", 2, "female", 145, "white"),
//
//        };
//        Farm farm1 = new Farm(animals2, "West Street 28", "John Billy");
//                       System.out.println(farm1);
//





          /*   Task  1       Abstraction
    Car деген класс тузунуз Полялары: model, colour, maxSpeed.  Конструктор, Getter Setter жана эки abstract ный
    метод  тузунуз gas() жана brake(). 2 subClass тузуп, super класстын методдорун реализация кылыныз
    Саб класстарга 2 ден объект тузуп, методдорун иштетиниз.
     */


//        Car toyota1 = new Toyota("Camry", 200, "white");
//        Car toyota2 = new Toyota("Prius", 180, "grey");
//        Car lexus1 = new Lexus("car.Lexus 570", 220, "black");
//        Car lexus2 = new Lexus("car.Lexus 530", 250, "blue");
//
//        System.out.println(toyota1);
//        toyota1.gas();
//        toyota1.brake();
//
//        System.out.println(toyota2);
//        toyota2.gas();
//        toyota2.brake();
//
//        System.out.println(lexus1);
//        lexus1.gas();
//        lexus1.brake();
//
//        System.out.println(lexus2);
//        lexus2.gas();
//        lexus2.brake();


    }
}