package di;

public interface Operator {
    void setSender(Sender sender);
    void broadcast(String msg);
}
