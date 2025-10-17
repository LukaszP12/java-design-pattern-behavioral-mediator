package pl.piwowarski.ChainofResponsibilityVsMediator.ChainofResponsibility;

public abstract class SupportHandler {
    protected SupportHandler next;

    public SupportHandler() {
    }

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public void handleRequest(String issueType) {
        if (next != null) {
            next.handleRequest(issueType);
        }
    }
}
