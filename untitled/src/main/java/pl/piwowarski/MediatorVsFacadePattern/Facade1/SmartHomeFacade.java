package pl.piwowarski.MediatorVsFacadePattern.Facade1;

public class SmartHomeFacade {
    private Light light;
    private Fan fan;
    private Thermostat thermostat;

    public SmartHomeFacade() {
        this.light = new Light();
        this.fan = new Fan();
        this.thermostat = new Thermostat();
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        light.turnOff();
        fan.stop();
        thermostat.setTemperature(18);
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        light.turnOn();
        fan.start();
        thermostat.setTemperature(22);
    }
}
