package creational.builder;

public class Cat {
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static CatBuilder builder() {
        return new CatBuilder();
    }
}
