package behavioral.command;

public class HumanReceiver implements Receiver {
    String name;

    public HumanReceiver(String name) {
        this.name = name;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Worker " + name + " makes coffee");
    }

    @Override
    public void cleanTable() {
        System.out.println("Worker " + name + "  cleans table");
    }
}
