package khpi.lab1.service;

import khpi.lab1.dto.User;
import khpi.lab1.log.Logger;

import java.util.List;

public class MessengerService implements CommunicationService {

    private static Logger log;

    @Override
    public void send(String text, List<User> receiver) {
        System.out.println(this.getClass().getSimpleName()+"#send");
    }
}
