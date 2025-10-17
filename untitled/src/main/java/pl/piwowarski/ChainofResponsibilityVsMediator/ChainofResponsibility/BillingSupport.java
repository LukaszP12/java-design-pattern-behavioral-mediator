package pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility;

public class BillingSupport extends SupportHandler{

    @Override
    public void handleRequest(String issueType) {
        if (issueType.equalsIgnoreCase("billing")) {
            System.out.println("BillingSupport: Handling billing issue.");
        } else {
            super.handleRequest(issueType);
        }
    }
}
