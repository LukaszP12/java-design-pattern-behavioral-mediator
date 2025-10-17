package pl.piwowarski.AirTrafficControlSystem;

public interface AirTrafficControlMediator {
    void registerRunway(Runway runway);
    void registerFlight(Flight flight);
    boolean isLandingAllowed();
    void setLandingStatus(boolean status);
}
