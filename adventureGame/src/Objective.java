public class Objective {
    String name;

    public Objective(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "name='" + name + '\'' +
                '}';
    }
}
