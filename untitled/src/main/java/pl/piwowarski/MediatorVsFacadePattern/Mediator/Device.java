package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public abstract class Device {
    protected SmartHomeMediator mediator;

    public Device(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }
}
