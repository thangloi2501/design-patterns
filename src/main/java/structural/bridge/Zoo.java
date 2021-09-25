package structural.bridge;

public abstract class Zoo {

    protected Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    public abstract String announce();
}
