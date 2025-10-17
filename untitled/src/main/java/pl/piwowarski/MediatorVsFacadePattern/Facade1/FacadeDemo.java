package pl.piwowarski.MediatorVsFacadePattern.Facade1;

public class FacadeDemo {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        home.arriveHome();
        home.leaveHome();
    }
}
