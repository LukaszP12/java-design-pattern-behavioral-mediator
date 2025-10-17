package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public interface SmartHomeMediator {
    void notify(Device sender, String event);
}
