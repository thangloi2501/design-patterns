package creational.builder;

public class Test {
    public static void main(String[] args) {
        System.out.println(Cat.builder()
                              .age(1)
                              .name("haha")
                              .build());
    }
}
