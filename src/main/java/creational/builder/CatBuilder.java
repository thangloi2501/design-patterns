package creational.builder;

public class CatBuilder {
    private int age;
    private String name;

    public CatBuilder() {
    }

    public CatBuilder age(int age) {
        this.age = age;
        return this;
    }

    public CatBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Cat build() {
        return new Cat(age, name);
    }
}