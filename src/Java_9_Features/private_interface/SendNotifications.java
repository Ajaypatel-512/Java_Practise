package Java_9_Features.private_interface;

public interface SendNotifications {

     static void sendNotifications(){
//        System.out.println("Establishing a connection");
//        establishConnection();
        retryingConnection();
        System.out.println("Sending multiple Notifications");
    }

    default void sendNotification(){
//        System.out.println("Establishing a connection");
        establishConnection();
        retryingConnection();
        System.out.println("Sending a Notifications");
    }

    private void establishConnection(){
        System.out.println("Establishing a connection");
    }

    private static void retryingConnection(){
        System.out.println("Retrying to Establish a connection");
    }

}
