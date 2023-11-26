package Java_9_Features.private_interface;

public interface SendNotifications {

    default void sendNotifications(){
//        System.out.println("Establishing a connection");
        establishConnection();
        System.out.println("Sending multiple Notifications");
    }

    default void sendNotification(){
//        System.out.println("Establishing a connection");
        establishConnection();
        System.out.println("Sending a Notifications");
    }

    private void establishConnection(){
        System.out.println("Establishing a connection");
    }

}
