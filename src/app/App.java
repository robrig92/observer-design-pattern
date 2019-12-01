package app;

import app.interfaces.Impl.ObserverImpl;
import app.interfaces.Impl.SubjectImpl;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Observer pattern");

        System.out.println("Subject created");
        SubjectImpl subject = new SubjectImpl();

        System.out.println("Observer A subscribed");
        ObserverImpl observerA = new ObserverImpl("Observer A", subject);
        subject.setValue(1);
        subject.setValue(2);
        
        System.out.println("Observer B subscribed");
        ObserverImpl observerB = new ObserverImpl("Observer B", subject);
        subject.addObserver(observerB);
        observerB.setSubject(subject);

        subject.setValue(19);
        subject.setValue(10);

        System.out.println("Removed Observer A");
        subject.removeObserver(observerA);

        subject.setValue(100);
    }
}