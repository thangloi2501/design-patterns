package creational.prototype;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("zoo1", Arrays.asList("cat", "dog"));

        Zoo zoo2 = zoo1.clone();

        System.out.println(zoo2);
    }
}
