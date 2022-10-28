package sms;

import comunication.Notification;

public class SmsNotificationAdapter implements Notification {

    private Sms sms;
    private String phone;
    private String sender;

    public SmsNotificationAdapter(Sms sms, String phone, String sender) {
        this.sms = sms;
        this.phone = phone;
        this.sender = sender;
    }

    @Override
    public void send(String title, String message) {
        System.out.println(this.getClass() + "#send");
        sms.sendSms(phone, sender, message);
    }

}
