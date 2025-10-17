package pl.piwowarski.MediatorVsObserverPattern.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        DialogMediator mediator = new DialogMediator();

        Button button = new Button(mediator);
        TextBox textBox = new TextBox(mediator);

        mediator.setButton(button);
        mediator.setTextBox(textBox);

        button.click(); // triggers textBox.clear() through mediator
    }
}
