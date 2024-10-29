package animal;

public class Horse  extends Animal {

    private String color;



    public Horse(String nickName, int age, String gender, double weight, String color) {
        super(nickName, age, gender, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
