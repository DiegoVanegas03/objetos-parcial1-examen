import java.util.LinkedList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Culture {
    private String cultura;
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


    public Culture(String cultura, String nombre, String descripcion) {
        this.cultura = cultura;
        this.name = nombre;
        this.description = descripcion;
    }


    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
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

    public void addRelatedCountry(String paisInflienciado) {
        this.countries.add(paisInflienciado);
    }
}
