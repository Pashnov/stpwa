package social.network;

import java.util.Objects;

public class Facebook implements SocialNetwork {

    private boolean isAuthorized;

    @Override
    public void auth(String login, String password) {
        if (Objects.nonNull(login) && Objects.nonNull(password)){
            // check correctness
            isAuthorized = true;
        }
    }

    @Override
    public boolean isAuthorized() {
        return isAuthorized;
    }

    @Override
    public void postMessage(String text) {
        if (isAuthorized) {
            System.out.println(this.getClass() + "#postMessage, text:" + text);
        } else {
            throw new RuntimeException("not authorized");
        }
    }

}
