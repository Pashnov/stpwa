package khpi.lab1.service;

import khpi.lab1.dto.User;

import java.util.List;

public interface CommunicationService {

    void send(String text, List<User> receiver);

}
