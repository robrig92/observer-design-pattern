package app;

import app.interfaces.Impl.ObserverImpl;
import app.interfaces.Impl.SubjectImpl;

public class App {
    public static void main(String[] args) throws Exception {
        ObserverImpl observerA;
        ObserverImpl observerB;
        SubjectImpl subject;
        System.out.println("Observer pattern");

        subject = createSubject();
        observerA = createObserver("Observer A", subject);
        subject.setValue(1);
        subject.setValue(2);

        observerB = createObserver("Observer B", subject);
        subject.setValue(19);
        subject.setValue(10);

        subject = removeObserver(subject, observerA);
        subject.setValue(100);
    }

    public static ObserverImpl createObserver(String name, SubjectImpl subject) {
        System.out.println(name + " subscribed");
        return new ObserverImpl(name, subject);
    }

    public static SubjectImpl createSubject() {
        System.out.println("Subject created");
        return new SubjectImpl();
    }

    public static SubjectImpl removeObserver(SubjectImpl subject, ObserverImpl observer) {
        System.out.println(observer.getName() + " unsuscribed");
        subject.removeObserver(observer);
        return subject;
    }
}