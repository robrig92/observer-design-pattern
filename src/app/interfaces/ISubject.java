package app.interfaces;

/**
 * Subject
 */
public interface ISubject {

    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers();
    public int getValue();
}