package patterns.creational.factory;

public class WhatsAppNotification implements Notification {

    @Override
    public void send(String msg) {
        System.out.println("WhatsApp Notification: " + msg);
    }

}
