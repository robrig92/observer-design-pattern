package app.interfaces;

/**
 * Observer
 */
public interface IObserver {

    public void update(int value);
    public void setSubject(ISubject subject);
}