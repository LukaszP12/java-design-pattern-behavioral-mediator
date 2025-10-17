package pl.piwowarski.CommandVsMediator.Mediator;

public class FanDevice extends Device {
    private boolean isRunning = false;

    public FanDevice(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void start() {
        if (!isRunning){
            System.out.println("Fan started");
            isRunning = true;
            mediator.notify(this, "fanStarted");
        }
    }

    public void stop(){
        if (isRunning){
            System.out.println("Fan stopped");
            isRunning = false;
            mediator.notify(this,"fanStopped");
        }
    }
}
