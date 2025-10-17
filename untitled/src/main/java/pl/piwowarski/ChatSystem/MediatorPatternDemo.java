package pl.piwowarski.ChatSystem;


public class MediatorPatternDemo {

    public static void main(String[] args) {
        ChatMediatorImpl mediator = new ChatMediatorImpl();

        User john = new ChatUser(mediator, "John");
        User jane = new ChatUser(mediator, "Jane");
        User alice = new ChatUser(mediator, "Alice");
        User bob = new ChatUser(mediator, "Bob");

        mediator.addUser(john);
        mediator.addUser(jane);
        mediator.addUser(alice);
        mediator.addUser(bob);

        john.send("Hi everyone!");
        alice.send("Hey John!");
    }
}
