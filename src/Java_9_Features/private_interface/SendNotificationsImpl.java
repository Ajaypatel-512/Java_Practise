package Java_9_Features.private_interface;

public class SendNotificationsImpl implements SendNotifications{

    public static void main(String[] args) {
        SendNotifications sendNotifications = new SendNotificationsImpl();
        sendNotifications.sendNotification();
        sendNotifications.sendNotifications();
    }

}
