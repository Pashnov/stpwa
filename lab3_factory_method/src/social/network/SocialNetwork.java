package social.network;

public interface SocialNetwork {

    void auth(String id, String password);
    boolean isAuthorized();
    void postMessage(String text);

}
