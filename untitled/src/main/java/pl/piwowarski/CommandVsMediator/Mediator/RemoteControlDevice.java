package pl.piwowarski.CommandVsMediator.Mediator;

public class RemoteControlDevice extends Device{

    public RemoteControlDevice(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void pressButton(String command){
        System.out.println("Remote pressed: " + command);
        mediator.notify(this,command);
    }
}
