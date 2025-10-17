package pl.piwowarski.MediatorVsObserverPattern.Observer;

public class TextBoxObserver implements Observer {
    private String text = "Some text";

    @Override
    public void update(String event) {
        if (event.equals("click")) {
            clear();
        }
    }

    private void clear() {
        System.out.println("TextBox cleared.");
        text = "";
    }
}
