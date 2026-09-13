
import java.util.*;

public class Library {

    private String name;
    private ArrayList<LibraryMaterial> materials;

    //constructor
    public Library(String name) {
        this.name = name;
        this.materials = new ArrayList<LibraryMaterial>();
    }

    // getters
    public String getName() {
        return name;
    }

    public ArrayList<LibraryMaterial> getMaterials() {
        return materials;
    }

    //methods and functions
    public void addMaterial(LibraryMaterial material) {

        materials.add(material);
    }

}
