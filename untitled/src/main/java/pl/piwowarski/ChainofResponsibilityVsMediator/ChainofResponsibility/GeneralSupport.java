package pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility;

public class GeneralSupport extends SupportHandler {

    public GeneralSupport() {
    }

    @Override
    public void handleRequest(String issueType) {
        System.out.println("GeneralSupport: Handling general issue or fallback.");
    }
}
