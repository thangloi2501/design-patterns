package creational.abstractfactory;

public class CatFactory implements AbstractAnimalFactory{

    public Animal create() {
        return new Cat();
    }
}
