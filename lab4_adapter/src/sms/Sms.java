package sms;

public class Sms {

    public void sendSms(String phone, String sender, String message) {
        System.out.println(this.getClass() + "#sendSms");
        System.out.println("sendSms to phone " + phone + " from " + sender + " with next message " + message);
    }
}
