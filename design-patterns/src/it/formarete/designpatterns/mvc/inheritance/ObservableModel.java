package it.formarete.designpatterns.mvc.inheritance;
import java.util.ArrayList;
import java.util.List;

import it.formarete.designpatterns.mvc.ModelImpl;
import it.formarete.designpatterns.mvc.View;
import it.formarete.designpatterns.observer.Observer;

public class ObservableModel extends ModelImpl {
    private List<View> observers;

    public ObservableModel() {
        observers = new ArrayList<View>();
    }

    public void registerObserver(View view) {
        observers.add(view);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
