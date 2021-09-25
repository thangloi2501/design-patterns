package creational.abstractfactory;

public class AnimalFactory {
    public static Animal create(AbstractAnimalFactory factory) {
        return factory.create();
    }
}
