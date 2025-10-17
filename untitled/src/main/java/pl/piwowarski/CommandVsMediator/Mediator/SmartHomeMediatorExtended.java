package pl.piwowarski.CommandVsMediator.Mediator;

public class SmartHomeMediatorExtended implements SmartHomeMediator {
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
        if (sender instanceof RemoteControlDevice) {
            if (event.equals("lightOn")) light.turnOn();
            else if (event.equals("lightOff")) light.turnOff();
            else if (event.equals("fanStart")) fan.start();
            else if (event.equals("fanStop")) fan.stop();
        } else if (sender instanceof FanDevice && event.equals("fanStarted")) {
            System.out.println("Mediator: Fan started — dimming light for comfort.");
            light.turnOff();
        } else if (sender instanceof FanDevice && event.equals("fanStopped")) {
            System.out.println("Mediator: Fan stopped — turning light back on.");
            light.turnOn();
        }
    }
}
