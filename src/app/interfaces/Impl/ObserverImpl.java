package app.interfaces.Impl;

import app.interfaces.IObserver;
import app.interfaces.ISubject;

/**
 * ObserverImpl
 */
public class ObserverImpl implements IObserver {

    private String name;
    private ISubject subject;

    public ObserverImpl(String name, ISubject subject) {
        this.name = name;
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(int value) {
        System.out.println(this.name + " reports: Updated value " + value);
    }

    @Override
    public void setSubject(ISubject subject) {
        this.subject = subject;
    }

    public void getValue() {
        System.out.println(this.name +  ": " + "Valor actual " + this.subject.getValue());
    }

    public String getName() {
        return this.name;
    }
}