package structural.proxy;

public class Test {
    public static void main(String[] args) {
        DBExecutorProxy proxy = new DBExecutorProxy("admin", new MySQLDBExecutor());
        proxy.execute();
    }
}
