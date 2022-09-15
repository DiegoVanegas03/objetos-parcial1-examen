import java.util.LinkedList;

public class Deity {
    private String name;
    private String description;
    private LinkedList<Deity> parents;

    public LinkedList<Deity> getParents() {
        return parents;
    }

    public void addParent(Deity parents) {
        this.parents.add(parents);
    }

    public Deity(String name, String description) {
        this.name = name;
        this.description = description;
        this.parents = new LinkedList<>();
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

    public void setDescription(String description) {
        this.description = description;
    }
}
