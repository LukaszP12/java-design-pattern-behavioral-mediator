package pl.piwowarski.MediatorVsObserverPattern.Mediator;

public class TextBox extends Component{
    private String text = "Some text";

    public TextBox(UIMediator mediator) {
        super(mediator);
    }

    public void clear(){
        System.out.println("TextBox cleared.");
        text = "";
    }
}
