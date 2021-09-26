package behavioral.command;

public class MakeCoffeeCommand implements Command{
    private Receiver receiver;

    public MakeCoffeeCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.makeCoffee();
    }
}
