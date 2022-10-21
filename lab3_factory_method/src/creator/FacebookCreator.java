package creator;

import social.network.Facebook;
import social.network.SocialNetwork;

public class FacebookCreator extends SocialCreator {

    @Override
    public SocialNetwork factoryMethod() {
        return new Facebook();
    }

}
