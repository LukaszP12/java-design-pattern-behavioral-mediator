package pl.piwowarski.CommandVsMediator.Mediator;


public abstract class Device {
    protected SmartHomeMediator mediator;

    public Device(SmartHomeMediator mediator) {
        this.mediator = mediator;
    }
}
