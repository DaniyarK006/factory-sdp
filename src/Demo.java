// File: notifier/Demo.java
package notifier;

public class Demo {
    public static void main(String[] args) throws Exception {
        notifierfactory factory = new SMSFactory();
        Notifier notifier = ((SMSFactory) factory).createNotifier();
        System.out.println(notifier.send("+12345678910", "Your code is 1234"));
    }
}