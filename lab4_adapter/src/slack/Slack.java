package slack;

import java.util.Objects;

public class Slack {

    private boolean authorized;
    private String chatId;

    public Slack(String login, String apiKey) {
        if (Objects.nonNull(login) && Objects.nonNull(apiKey)) {
            this.authorized = true;
        } else {
            throw new RuntimeException("incorrect login/apiKey");
        }
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public void sendMessage(String message) {
        System.out.println(this.getClass() + "#sendMessage");
        System.out.println("slack, sent message " + message);
    }
}
