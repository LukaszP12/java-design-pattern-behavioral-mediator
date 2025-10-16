package pl.piwowarski;

import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
    }

    public ChatMediatorImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : this.users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }
}
