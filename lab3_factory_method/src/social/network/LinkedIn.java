package social.network;

import javax.naming.AuthenticationException;
import java.util.Objects;

public class LinkedIn implements SocialNetwork {
    
    private boolean isAuthorized;

    @Override
    public void auth(String email, String password) {
        if (Objects.nonNull(email) && Objects.nonNull(password)){
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
