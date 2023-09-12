package Observer;

import java.util.ArrayList;
import java.util.List;

public class Girl implements Observed{
    String msg;
    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(String msg){
        for(Observer observer : observers){
            observer.notify(msg);
        }
    }

}
