package pl.piwowarski.ChatSystem;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
