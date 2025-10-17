package pl.piwowarski.MediatorVsObserverPattern.Mediator;

public class Button extends Component {
    public Button(UIMediator mediator) {
        super(mediator);
    }

    public void click(){
        System.out.println("Button clicked!");
        mediator.notify(this, "click");
    }
}
