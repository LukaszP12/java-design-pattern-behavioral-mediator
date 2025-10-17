package pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        // Build the chain
        SupportHandler tech = new TechnicalSupport();
        SupportHandler billing = new BillingSupport();
        SupportHandler general = new GeneralSupport();

        tech.setNext(billing);
        billing.setNext(general);

        // Send requests
        tech.handleRequest("technical");
        tech.handleRequest("billing");
        tech.handleRequest("unknown");
    }
}
