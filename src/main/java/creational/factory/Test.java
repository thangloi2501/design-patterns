package creational.factory;

public class Test {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.create("cat");
        Animal dog = AnimalFactory.create("dog");

        System.out.println(cat.hello() + " " + dog.hello());
    }
}
