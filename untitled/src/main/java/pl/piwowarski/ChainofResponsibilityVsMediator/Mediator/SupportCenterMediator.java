package pl.piwowarski.ChainofResponsibilityVsMediator.Mediator;

import pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility.BillingSupport;
import pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility.GeneralSupport;
import pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility.TechnicalSupport;

public class SupportCenterMediator implements SupportMediator {
    private TechnicalSupport techSupport;
    private BillingSupport billingSupport;
    private GeneralSupport generalSupport;

    public void setTechnicalSupport(TechnicalSupport techSupport) {
        this.techSupport = techSupport;
    }

    public void setBillingSupport(BillingSupport billingSupport) {
        this.billingSupport = billingSupport;
    }

    public void setGeneralSupport(GeneralSupport generalSupport) {
        this.generalSupport = generalSupport;
    }

    @Override
    public void dispatch(String issueType) {
        if (issueType.equalsIgnoreCase("technical")) {
            techSupport.handleRequest(issueType);
        } else if (issueType.equalsIgnoreCase("billing")) {
            billingSupport.handleRequest(issueType);
        } else {
            generalSupport.handleRequest(issueType);
        }
    }
}
