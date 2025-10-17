package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public class LightDevice extends Device{
    public LightDevice(SmartHomeMediator mediator) {
        super(mediator);
    }
    public void turnOn(){
        System.out.println("Light turned ON");
    }
    public void turnOff() {
        System.out.println("Light turned OFF");
    }
}
