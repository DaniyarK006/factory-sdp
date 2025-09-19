// File: notifier/EmailNotifier.java
package notifier;

public class EmailNotifier implements Notifier {
    @Override
    public boolean send(String recipient, String message) throws Exception {
        // The actual email sending logic should go here
        // We'll use a stub for this example
        System.out.println("Sending Email to " + recipient + ": " + message);
        return true;
    }
}