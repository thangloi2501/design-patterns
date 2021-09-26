package behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        AbstractUser u1 = new User(mediator, "Loi");
        AbstractUser u2 = new User(mediator, "Tuan");
        AbstractUser u3 = new User(mediator, "Tan");

        mediator.addUser(u1);
        mediator.addUser(u2);
        mediator.addUser(u3);

        u1.send("hello all!");
    }
}
