package pl.piwowarski.AirTrafficControlSystem;

public class MediatorPatternAirTrafficDemo {
    public static void main(String[] args) {
        AirTrafficControlMediator atcMediator = new ATCMediator();

        Flight flight1 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(flight1);
        atcMediator.registerRunway(mainRunway);

        // Simulation
        flight1.requestLanding();
        mainRunway.land(); // runway is free again
        flight1.requestLanding(); // now allowed
        flight1.land();
    }
}
