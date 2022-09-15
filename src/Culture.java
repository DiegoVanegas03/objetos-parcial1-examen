import java.util.LinkedList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Culture {
    private String name;
    private String description;
    private LinkedList<String> countries;
    private List<Deity> deities;

    public List<Deity> getDeities() {
        return deities;
    }

    public void addDeity(Deity deity) {
        this.deities.add(deity);
    }


    public Culture( String nombre, String descripcion) {
        this.name = nombre;
        this.description = descripcion;
        this.countries = new LinkedList<>();
        this.deities = new LinkedList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descripcion) {
        this.description = descripcion;
    }

    public LinkedList<String>  getRelatedContries() {
        return countries;
    }

    public void addRelatedCountry(String pais) {
        countries.add(pais);
    }
}
