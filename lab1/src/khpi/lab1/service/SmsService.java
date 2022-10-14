package khpi.lab1.service;

import khpi.lab1.dto.User;

import java.util.List;

public class SmsService implements CommunicationService {

    @Override
    public void send(String text, List<User> receiver) {
        System.out.println(this.getClass().getSimpleName()+"#send");
    }

}
