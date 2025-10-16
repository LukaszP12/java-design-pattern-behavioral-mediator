package pl.piwowarski.AirTrafficControlSystem;

public class Flight implements Command {
    private AirTrafficControlMediator mediator;

    public Flight(AirTrafficControlMediator mediator) {
        this.mediator = mediator;
    }

    public void requestLanding() {
        if (mediator.isLandingAllowed()) {
            System.out.println("Landing permitted. Proceeding to land.");
            mediator.setLandingStatus(false);
        } else {
            System.out.println("Landing not permitted. Waiting...");
        }
    }

    @Override
    public void land() {
        System.out.println("Flight landed successfully.");
    }
}
