package pl.piwowarski.ChainofResponsibilityVsMediator.Mediator;

public class GeneralSupport implements SupportDepartment{
    @Override
    public void handle(String issueType) {
        System.out.println("GeneralSupport: Handling general issue or fallback.");
    }
}
