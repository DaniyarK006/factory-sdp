// File: notifier/EmailFactory.java
package notifier;

public class EmailFactory implements NotifierFactory {
    @Override
    public Notifier createNotifier() {
        return new EmailNotifier();
    }
}