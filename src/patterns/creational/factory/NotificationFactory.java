package patterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class NotificationFactory {

    private static final Map<String, Supplier<Notification>> NOTIFICATION_MAP = new HashMap<>();

    static {
        NOTIFICATION_MAP.put("EMAIL", EmailNotification::new);
        NOTIFICATION_MAP.put("SMS", SMSNotification::new);
    }

    private NotificationFactory() {

    }

    public static void registerNotification(String type, Supplier<Notification> supplier) {
        NOTIFICATION_MAP.put(type, supplier);
    }

    public static Notification createNotification(String type) {
        if (type == null || !NOTIFICATION_MAP.containsKey(type)) {
            throw new IllegalArgumentException("Notification type not supported: " + type);
        }
        return NOTIFICATION_MAP.get(type).get();
    }
}
