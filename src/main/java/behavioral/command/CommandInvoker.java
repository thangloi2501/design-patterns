package behavioral.command;

public class CommandInvoker implements Command{
    private Command command;

    public CommandInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
