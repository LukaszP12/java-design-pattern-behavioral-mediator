package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        SmartHomeMediatorImpl mediator = new SmartHomeMediatorImpl();

        LightDevice light = new LightDevice(mediator);
        FanDevice fan = new FanDevice(mediator);
        ThermostatDevice thermostat = new ThermostatDevice(mediator);

        mediator.setLight(light);
        mediator.setFan(fan);

        thermostat.setTemperature(30);
        thermostat.setTemperature(16);
    }
}
