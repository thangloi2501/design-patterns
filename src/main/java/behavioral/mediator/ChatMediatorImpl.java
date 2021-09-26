package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    List<AbstractUser> users = new ArrayList<>();

    @Override
    public void addUser(AbstractUser user) {
        users.add(user);
    }

    @Override
    public void sendMessage(AbstractUser user, String msg) {
        for (AbstractUser u: users) {
            if (u != user)
                u.receive(msg);
        }
    }
}
