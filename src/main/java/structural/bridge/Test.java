package structural.bridge;

public class Test {
    public static void main(String[] args) {
        Zoo dogZoo = new DogZoo (new Cat());
        Zoo catZoo = new CatZoo (new Dog());

        System.out.println(dogZoo.announce());
        System.out.println(catZoo.announce());
    }
}
