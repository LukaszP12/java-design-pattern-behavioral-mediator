package pl.piwowarski.AirTrafficControlSystem;

public class ATCMediator implements AirTrafficControlMediator {
    private Flight flight;
    private Runway runway;
    private boolean landingAllowed;

    @Override
    public void registerRunway(Runway runway) {
        this.landingAllowed = true;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingAllowed() {
        return landingAllowed;
    }

    @Override
    public void setLandingStatus(boolean status) {
        landingAllowed = status;
    }
}
