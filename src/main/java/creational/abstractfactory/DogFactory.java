package creational.abstractfactory;

public class DogFactory implements AbstractAnimalFactory{

    public Animal create() {
        return new Dog();
    }
}
