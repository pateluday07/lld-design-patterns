package patterns.creational.factory;

public class FactoryPatternTester {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("EMAIL");
        notification.send("Message One");

        notification = NotificationFactory.createNotification("SMS");
        notification.send("Message Two");

        NotificationFactory.registerNotification("WHATSAPP", WhatsAppNotification::new);
        notification = NotificationFactory.createNotification("WHATSAPP");
        notification.send("Message Three");

        notification = NotificationFactory.createNotification("INSTAGRAM");
        notification.send("Message Four");
    }
}
