/* 
The design principle used in the provided code is the Dependency Inversion 
Principle (DIP).


The Dependency Inversion Principle (DIP) states that high-level modules 
should not depend on low-level modules. Both should depend on abstractions, 
and abstractions should not depend on details. In simpler terms, it suggests 
that classes should depend on abstractions (interfaces or abstract classes) 
rather than concrete implementations.
*/
interface NotificationSender {
    void sendNotification (String message);
}

class EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        // Code to send an email
        System.out.println("Sending email: "+message);
    }
}

class User {
    private NotificationSender notificationSender;

    public User (NotificationSender notificationSender){
        this.notificationSender = notificationSender; //Dependency on NotificationSender
    }
    
    public void notifyUser(String message){
        notificationSender.sendNotification(message);
    }
}


public class D {
    public static void main(String args[]){
        NotificationSender emailSender = new EmailSender(); // Dependency Injection
        User user = new User (emailSender);
        user.notifyUser("Hello, this is an email notification!");        
    }
}
