package pl.piwowarski.CommandVsMediator.Mediator;

public class MediatorSmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeMediatorExtended mediator = new SmartHomeMediatorExtended();

        LightDevice light = new LightDevice(mediator);
        FanDevice fan = new FanDevice(mediator);
        RemoteControlDevice remote = new RemoteControlDevice(mediator);

        mediator.setLight(light);
        mediator.setFan(fan);

        // Remote sends commands through Mediator
        remote.pressButton("lightOn");
        remote.pressButton("fanStart");
        remote.pressButton("fanStop");
        remote.pressButton("lightOff");
    }
}
