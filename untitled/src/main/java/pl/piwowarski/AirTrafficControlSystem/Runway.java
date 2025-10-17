package pl.piwowarski.AirTrafficControlSystem;

public class Runway implements Command{
    private AirTrafficControlMediator mediator;

    public Runway(AirTrafficControlMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        System.out.println("Runway is clear for landing.");
        mediator.setLandingStatus(true);
    }
}
