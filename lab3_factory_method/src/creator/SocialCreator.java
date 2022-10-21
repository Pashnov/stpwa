package creator;

import social.network.SocialNetwork;

public abstract class SocialCreator {

    public abstract SocialNetwork factoryMethod();

    public SocialNetwork getInstance(String id, String password) {
        SocialNetwork socialNetwork = factoryMethod();
        socialNetwork.auth(id, password);
        System.out.println(socialNetwork.getClass() + "#getInstance");
        return socialNetwork;
    }

}
