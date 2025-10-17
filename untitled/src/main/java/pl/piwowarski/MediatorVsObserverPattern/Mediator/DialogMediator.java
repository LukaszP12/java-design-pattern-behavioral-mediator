package pl.piwowarski.MediatorVsObserverPattern.Mediator;

public class DialogMediator implements UIMediator{
    private Button button;
    private TextBox textBox;

    public void setButton(Button button){
        this.button = button;
    }

    public void setTextBox(TextBox textBox) {
        this.textBox = textBox;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == button && event.equals("click")){
            textBox.clear();
        }
    }
}
