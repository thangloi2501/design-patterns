package behavioral.command;

public class Test {
    public static void main(String[] args) {
        Command cleanTableCommand = new CleanTableCommand(new HumanReceiver("2"));

        CommandInvoker invoker = new CommandInvoker(cleanTableCommand);
        invoker.execute();
    }
}
