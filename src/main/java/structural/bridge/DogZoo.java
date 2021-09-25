package structural.bridge;

public class DogZoo extends Zoo {
    public DogZoo(Animal animal) {
        super(animal);
    }

    @Override
    public String announce() {
        return "Dog zoo has animal says: " + this.animal.say();
    }
}
