package animal;

public abstract class Animal {

    private String nickName;
    private String gender;
    private double weight;
    private int age;



    public Animal(String nickName, int age, String gender, double weight) {
        this.nickName = nickName;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nAnimal { " +
                "age= " + age +
                ",  nickName= '" + nickName + '\'' +
                ",  gender= '" + gender + '\'' +
                ",  weight= " + weight +
                '}';
    }
}
