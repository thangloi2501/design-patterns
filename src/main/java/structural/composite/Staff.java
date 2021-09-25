package structural.composite;

public class Staff implements Employee{
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    @Override
    public String details() {
        return name;
    }
}
