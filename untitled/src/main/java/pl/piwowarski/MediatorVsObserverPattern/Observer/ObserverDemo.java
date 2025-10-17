package pl.piwowarski.MediatorVsObserverPattern.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        ButtonObservable button = new ButtonObservable();
        TextBoxObserver textBox = new TextBoxObserver();

        button.addObserver(textBox);

        button.click(); // triggers textBox.clear() via observer pattern
    }
}
