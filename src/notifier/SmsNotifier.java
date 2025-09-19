// File: notifier/NotificationModule.java
package notifier;

public interface Notifier {
    String send(String to, String message);
}

class SMSNotifier implements Notifier {
    @Override
    public String send(String to, String message) {
        return "SMS to " + to + ": " + message;
    }
}

interface NotifierFactory {
    Notifier createNotifier();
}

class SMSFactory implements notifierfactory {
    @Override
    public Notifier createNotifier() {
        return new SMSNotifier();
    }

    @Override
    public String send(String to, String message) {
        return "";
    }
}

class Demo {
    public static void main(String[] args) {
        notifierfactory factory = new SMSFactory();
        Notifier notifier = factory.createNotifier();
        System.out.println(notifier.send("+1234567890", "Hello from Sms!"));
    }
}
