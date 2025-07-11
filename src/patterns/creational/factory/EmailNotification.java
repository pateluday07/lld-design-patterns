package patterns.creational.factory;

public class EmailNotification implements  Notification {

    @Override
    public void send(String msg) {
        System.out.println("Email Notification: " + msg);
    }

}
