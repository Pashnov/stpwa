package creator;

import social.network.LinkedIn;
import social.network.SocialNetwork;

public class LinkedInCreator extends SocialCreator {

    @Override
    public SocialNetwork factoryMethod() {
        return new LinkedIn();
    }
}
