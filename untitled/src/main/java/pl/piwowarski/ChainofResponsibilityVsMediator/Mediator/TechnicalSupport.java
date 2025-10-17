package pl.piwowarski.ChainofResponsibilityVsMediator.Mediator;

public class TechnicalSupport implements SupportDepartment{
    @Override
    public void handle(String issueType) {
        System.out.println("TechnicalSupport: Handling technical issue.");
    }
}
