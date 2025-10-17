package pl.piwowarski.MediatorVsFacadePattern.Mediator;

public class ThermostatDevice extends Device {
    private int temperature;

    public ThermostatDevice(SmartHomeMediator mediator) {
        super(mediator);
    }

    public void setTemperature(int temp) {
        System.out.println("Thermostat detected temperature: " + temp + "°C");
        this.temperature = temp;
        if (temp > 25) {
            mediator.notify(this, "tooHot");
        } else if (temp < 18) {
            mediator.notify(this, "tooCold");
        }
    }
}
