package structural.adapter;

public class Test {
    public static void main(String[] args) {
        DogAdapter adapter = new DogAdapterImpl(new Dog());

        System.out.println(adapter.say());
    }
}
