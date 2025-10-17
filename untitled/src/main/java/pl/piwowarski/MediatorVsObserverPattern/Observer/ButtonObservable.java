package pl.piwowarski.MediatorVsObserverPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class ButtonObservable {
    private List<Observer> observers = new ArrayList<>();

    public ButtonObservable() {
    }

    public ButtonObservable(Observer observer) {
        observers.add(observer);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void click(){
        System.out.println("Button clicked!");
        notifyObservers("click");
    }

    private void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
