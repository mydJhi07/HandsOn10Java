package Latihan1;

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim Email: " + message);
    }
}

class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}

class WhatsAppNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String message) {
        notifier.send(message);
    }
}

public class Main {
    public static void main(String[] args) {

        NotificationService email =
                new NotificationService(new EmailNotifier());

        NotificationService sms =
                new NotificationService(new SMSNotifier());

        NotificationService whatsapp =
                new NotificationService(new WhatsAppNotifier());

        email.notify("Halo, ini email test!");
        sms.notify("Ini SMS test!");
        whatsapp.notify("Ini pesan WhatsApp test!");
    }
}
