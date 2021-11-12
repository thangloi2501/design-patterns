package creational.singleton;

public class Singleton2 {
    static {
        System.out.println("Singleton2 initializing...");
    }

    public static class SingletonHolder {
        private SingletonHolder() {

        }

        static {
            System.out.println("SingletonHolder initializing...");
        }
        private static final Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        System.out.println("Singleton2 getInstance....");
        return SingletonHolder.instance;
    }

    public void doSomething() {
        //blah blah....
    }
}
