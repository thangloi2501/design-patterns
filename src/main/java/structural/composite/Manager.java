package structural.composite;

public class Manager implements Employee {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String details() {
        return name;
    }
}
