package creational.factory;

public class AnimalFactory {
    public static Animal create(String type) {
        if (type.equals("dog"))
            return new Dog();
        else
            return new Cat();
    }
}
