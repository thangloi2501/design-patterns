package behavioral.mediator;

public class User extends AbstractUser {

    public User(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("User: " + name + " send msg: " + msg);
        mediator.sendMessage(this, msg);
    }

    @Override
    public void receive(String msg) {
        System.out.println("User: " + this.name + " received msg: " + msg);
    }
}
