package animal;
import java.util.Arrays;
public class Farm {

    private String address;
    private Animal[] animals;
    private String ownerName;

    public Farm( Animal[] animals, String address, String ownerName) {

        this.animals = animals;
        this.address = address;
        this.ownerName = ownerName;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "\nFarm {" +
                " Address of Farm: '" + address + '\'' +
                ", \nanimals = " + Arrays.toString(animals) +
                ", \nFarm owner's name: '" + ownerName + '\'' +
                '}';
    }
}
