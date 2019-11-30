package app;

import app.interfaces.IObserver;
import app.interfaces.ISubject;
import app.interfaces.Impl.ObserverImpl;
import app.interfaces.Impl.SubjectImpl;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Observer pattern");

        System.out.println("Subject created");
        ISubject subject = new SubjectImpl();

        System.out.println("Observer A created");
        IObserver observerA = new ObserverImpl("Observer A");
        System.out.println("Observer B created");
        IObserver observerB = new ObserverImpl("Observer B");

        System.out.println("Observer A registered");
        subject.addObserver(observerA);
        observerA.setSubject(subject);
        ((SubjectImpl) subject).setValue(1);
        ((SubjectImpl) subject).setValue(2);

        System.out.println("Observer B registered in subject");
        subject.addObserver(observerB);
        observerB.setSubject(subject);

        ((SubjectImpl) subject).setValue(19);
        ((SubjectImpl) subject).setValue(10);

        System.out.println("Removed Observer A");
        subject.removeObserver(observerA);

        ((SubjectImpl) subject).setValue(100);
    }
}