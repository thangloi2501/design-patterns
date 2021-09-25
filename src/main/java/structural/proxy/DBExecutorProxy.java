package structural.proxy;

public class DBExecutorProxy implements DBExecutor {
    String user;
    DBExecutor dbExecutor;

    public DBExecutorProxy(String user, DBExecutor dbExecutor) {
        this.user = user;
        this.dbExecutor = dbExecutor;
    }

    @Override
    public void execute() {
        if (user.equals("admin")) {
            System.out.println("Checking permission....");
            dbExecutor.execute();
            System.out.println("Proxy done.");
        } else
            throw new RuntimeException("No permission!!!");
    }
}
