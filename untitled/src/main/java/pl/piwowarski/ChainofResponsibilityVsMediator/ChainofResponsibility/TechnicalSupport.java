package pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility;

public class TechnicalSupport extends SupportHandler {

    @Override
    public void handleRequest(String issueType) {
        if (issueType.equalsIgnoreCase("technical")) {
            System.out.println("TechnicalSupport: Handling technical issue.");
        } else {
            super.handleRequest(issueType);
        }
    }
}
