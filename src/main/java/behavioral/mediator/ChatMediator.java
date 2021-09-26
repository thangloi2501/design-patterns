package behavioral.mediator;

public interface ChatMediator {
    void sendMessage(AbstractUser user, String msg);
    void addUser(AbstractUser user);
}