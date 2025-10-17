package pl.piwowarski.MediatorVsObserverPattern.Mediator;

import java.awt.*;

public interface UIMediator {
    void notify(Component sender, String event);
}
