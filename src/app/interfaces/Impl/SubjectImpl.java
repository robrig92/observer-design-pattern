package app.interfaces.Impl;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.IObserver;
import app.interfaces.ISubject;

/**
 * SubjectImpl
 */
public class SubjectImpl implements ISubject {

    private List<IObserver> observers;
    private int value;

    public SubjectImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.observers.stream().forEach(observer -> observer.update(value));
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
        this.notifyObservers();
    }
}