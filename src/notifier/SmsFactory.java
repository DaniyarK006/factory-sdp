// File: notifier/SmsFactory.java
package notifier;

public class SmsFactory implements NotifierFactory {
    @Override
    public Notifier createNotifier() {
        return new SmsNotifier();
    }
}