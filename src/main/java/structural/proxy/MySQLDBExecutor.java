package structural.proxy;

public class MySQLDBExecutor implements DBExecutor {

    @Override
    public void execute() {
        System.out.println("Dropping database.........");
    }
}
