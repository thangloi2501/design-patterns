package behavioral.command;

public class Receiver1 implements Receiver {
    @Override
    public void makeCoffee() {
        System.out.println("Worker 1 makes coffee");
    }

    @Override
    public void cleanTable() {
        System.out.println("Worker 1 cleans table");
    }
}
