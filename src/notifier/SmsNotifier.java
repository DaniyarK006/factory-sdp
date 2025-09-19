// File: notifier/SmsNotifier.java
package notifier;

public class SmsNotifier implements Notifier {
    @Override
    public boolean send(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
        return true;
    }
}