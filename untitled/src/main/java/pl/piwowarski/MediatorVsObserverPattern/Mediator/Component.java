package pl.piwowarski.MediatorVsObserverPattern.Mediator;

public abstract class Component {
    protected UIMediator mediator;

    public Component(UIMediator mediator) {
        this.mediator = mediator;
    }
}
