package slack;

import comunication.Notification;

public class SlackNotificationAdapter implements Notification {

    private Slack slack;

    public SlackNotificationAdapter(Slack slack) {
        this.slack = slack;
    }

    @Override
    public void send(String title, String message) {
        System.out.println(this.getClass() + "#send");
        slack.sendMessage(message);
    }
}
