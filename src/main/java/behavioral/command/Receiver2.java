package behavioral.command;

public class Receiver2 implements Receiver {
    @Override
    public void makeCoffee() {
        System.out.println("Worker 2 makes coffee");
    }

    @Override
    public void cleanTable() {
        System.out.println("Worker 2 cleans table");
    }
}
