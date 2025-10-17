package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public class SmartHomeMediatorImpl implements SmartHomeMediator {
    private LightDevice light;
    private FanDevice fan;

    public void setLight(LightDevice light) {
        this.light = light;
    }

    public void setFan(FanDevice fan) {
        this.fan = fan;
    }

    @Override
    public void notify(Device sender, String event) {
        if (sender instanceof ThermostatDevice) {
            if (event.equals("tooHot")) {
                System.out.println("Mediator: It's too hot! Turning on fan and dimming light...");
                fan.start();
                light.turnOff();
            } else if (event.equals("tooCold")) {
                System.out.println("Mediator: It's too cold! Turning off fan and turning on light...");
                fan.stop();
                light.turnOn();
            }
        } else if (sender instanceof FanDevice && event.equals("stopped")) {
            System.out.println("Mediator: Fan stopped — notifying light to turn ON for visibility.");
            light.turnOn();
        }
    }
}
