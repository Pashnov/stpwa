package comunication;

public class EmailNotification implements Notification {

    private final String adminEmail;

    public EmailNotification(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public void send(String title, String message) {
        sendEmail(title, message);
    }

    private void sendEmail(String title, String message) {
        System.out.println(this.getClass() + "#sendEmail");
        System.out.println("Sent email with title " + title + " to " + adminEmail + " that says " + message);
    }
}
