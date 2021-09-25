package creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.create(new CatFactory());
        Animal dog = AnimalFactory.create(new DogFactory());

        System.out.println(cat.hello() + " " + dog.hello());
    }
}
