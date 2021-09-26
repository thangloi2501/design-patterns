package di;

public class InformationOperator implements Operator {
    private Sender sender;

    public InformationOperator(Sender sender) {
        this.sender = sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void broadcast(String msg) {
        sender.send(msg);
    }
}
