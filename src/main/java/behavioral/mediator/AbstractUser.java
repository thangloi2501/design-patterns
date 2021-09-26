package behavioral.mediator;

public abstract class AbstractUser {
    protected ChatMediator mediator;
    protected String name;

    public AbstractUser(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
