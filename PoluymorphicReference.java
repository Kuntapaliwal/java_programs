package java_programs;

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("sending an sms notification");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("sending an e-mail notification");
    }
}

public class PoluymorphicReference {
    public static void main(String[] args) {
        Notification notification;
        notification = new SMSNotification();
        notification.notifyUser();
        notification = new EmailNotification();
        notification.notifyUser();
    }
}
