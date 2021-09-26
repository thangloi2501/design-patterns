package behavioral.command;

public class CleanTableCommand implements Command{
    private Receiver receiver;

    public CleanTableCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cleanTable();
    }
}
