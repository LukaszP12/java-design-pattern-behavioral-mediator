package pl.piwowarski.CommandVsMediator.Mediator;

public interface SmartHomeMediator {
    void notify(Device sender, String event);
}
