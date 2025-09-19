// File: main/Main.java
package main;


import notifier.EmailFactory;
import notifier.Notifier;
import notifier.NotifierFactory;

public class Main {
    public static void main(String[] args) {
        // Email part
        NotifierFactory factory;
        factory = new EmailFactory();
        Notifier email = factory.createNotifier();
        try {
            if (email.send("kairatov300100@gmail.com", "Hi")) {
                System.out.println("Email sent successfully");
            } else {
                System.out.println("Email sending failed");
            }
        } catch (Exception e) {
            System.err.println("Email exception: " + e.getMessage());
        }

        // SMS part
        factory = new NotifierFactory() {
            @Override
            public Notifier createNotifier() {
                return null;
            }
        };
        Notifier sms = factory.createNotifier();
        try {
            if (sms.send("+77777778888", "Your code is 7777")) {
                System.out.println("SMS sent successfully");
            } else {
                System.out.println("SMS sending failed");
            }
        } catch (Exception e) {
            System.err.println("SMS exception: " + e.getMessage());
        }
    }
}

