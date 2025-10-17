package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public class FanDevice extends Device{
    public FanDevice(SmartHomeMediator mediator) {
        super(mediator);
    }
    public void start() {
        System.out.println("Fan started");
    }
    public void stop() {
        System.out.println("Fan stopped");
    }
}
