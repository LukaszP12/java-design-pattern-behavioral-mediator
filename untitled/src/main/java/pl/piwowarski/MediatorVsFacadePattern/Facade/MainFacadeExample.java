package pl.piwowarski.MediatorVsFacadePattern.Facade;

public class MainFacadeExample {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
