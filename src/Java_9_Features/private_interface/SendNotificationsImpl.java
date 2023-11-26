package Java_9_Features.private_interface;

public class SendNotificationsImpl implements SendNotifications{

    public static void main(String[] args) {
        SendNotifications sendNotifications = new SendNotificationsImpl();
        sendNotifications.sendNotification();
//        sendNotifications.sendNotifications(); static method not called by object name
        SendNotifications.sendNotifications(); //static method called by Class/Interface name
    }

}
