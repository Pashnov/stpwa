import comunication.EmailNotification;
import comunication.Notification;
import slack.Slack;
import slack.SlackNotificationAdapter;
import sms.Sms;
import sms.SmsNotificationAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Notification> allWaysToNotify = new ArrayList<>();

        EmailNotification emailNotification = new EmailNotification("admin@mail.ua");
        allWaysToNotify.add(emailNotification);

        Slack slack = new Slack("login", "apiKey");
        SlackNotificationAdapter slackNotification = new SlackNotificationAdapter(slack);
        allWaysToNotify.add(slackNotification);

        Sms sms = new Sms();
        SmsNotificationAdapter smsNotification = new SmsNotificationAdapter(sms, "135798", "system notif");
        allWaysToNotify.add(smsNotification);

        for (Notification notification : allWaysToNotify) {
            notification.send("title1", "msg1");
        }

    }

}