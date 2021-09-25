package structural.bridge;

public class CatZoo extends Zoo {
    public CatZoo(Animal animal) {
        super(animal);
    }

    @Override
    public String announce() {
        return "Cat zoo has animal says: " + this.animal.say();
    }
}
