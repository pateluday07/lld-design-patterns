package patterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    private static final Map<String, Supplier<Notification>> notificationMap = new HashMap<>();

    static {
        notificationMap.put("EMAIL", EmailNotification::new);
        notificationMap.put("SMS", SMSNotification::new);
    }

    public static void registerNotification(String type, Supplier<Notification> supplier) {
        notificationMap.put(type, supplier);
    }

    public static Notification createNotification(String type) {
        if (type == null || !notificationMap.containsKey(type)) {
            throw new IllegalArgumentException("Notification type not supported: " + type);
        }
        return notificationMap.get(type).get();
    }
}
