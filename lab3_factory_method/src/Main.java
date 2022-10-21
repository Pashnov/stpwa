import creator.FacebookCreator;
import creator.LinkedInCreator;
import creator.SocialCreator;
import social.network.Facebook;
import social.network.SocialNetwork;

public class Main {

    private static SocialCreator FACEBOOK_CREATOR;
    private static SocialCreator LINKED_IN_CREATOR;
    private static SocialNetwork FACEBOOK;
    private static SocialNetwork LINKED_IN;

    public static void main(String[] args) {
        System.out.println("Hello lab 3!");

        LINKED_IN_CREATOR = new LinkedInCreator();
        FACEBOOK_CREATOR = new FacebookCreator();

        FACEBOOK = FACEBOOK_CREATOR.getInstance("login", "pswrd");
        LINKED_IN = LINKED_IN_CREATOR.getInstance("email", "pwd");

        FACEBOOK.postMessage("some msg1");
        Facebook fb = new Facebook();
        fb.postMessage("some msg without auth");
    }

    public static void restCallFacebook(String text) {
        FACEBOOK.postMessage(text);
    }

    public static void restCallLinkedIn(String text) {
        LINKED_IN.postMessage(text);
    }

}