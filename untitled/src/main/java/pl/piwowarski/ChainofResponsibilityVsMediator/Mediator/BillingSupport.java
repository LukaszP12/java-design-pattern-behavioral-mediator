package pl.piwowarski.ChainofResponsibilityVsMediator.Mediator;

public class BillingSupport implements SupportDepartment{
    @Override
    public void handle(String issueType) {
        System.out.println("BillingSupport: Handling billing issue.");
    }
}
