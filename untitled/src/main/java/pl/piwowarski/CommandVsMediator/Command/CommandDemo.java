package pl.piwowarski.CommandVsMediator.Command;

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command fanStart = new FanStartCommand(fan);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton(); // Light ON

        remote.setCommand(fanStart);
        remote.pressButton(); // Fan started
    }
}
