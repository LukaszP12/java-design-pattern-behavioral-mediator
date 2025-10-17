package pl.piwowarski.CommandVsMediator.Mediator;

public class LightDevice extends Device{
    private boolean isOn = false;

    public LightDevice(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void turnOn() {
        if (!isOn){
            System.out.println("Light is ON");
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn){
            System.out.println("Light is OFF");
            isOn = false;
        }
    }
}
