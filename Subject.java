/* ** Subject implementation of ArrayList no longer used in Observer/Observable Class **
import java.util.ArrayList;

abstract class Subject
{
	protected ArrayList<Observer> observers;
	
	public abstract void registerObserver(Observer observer);
    public abstract void removeObserver(Observer observer);
    public abstract void notifyObservers();
    
    public Subject()
    {
    	observers = new ArrayList<Observer>();
    }
}*/