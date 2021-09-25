package creational.singleton;

public class Singleton2 {
    public static class SingletonHolder {
        private static final Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
