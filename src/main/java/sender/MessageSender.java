package sender;

import facebook.FacebookUser;
import twitter.TwitterAdapter;
import twitter.TwitterUser;

public class MessageSender {
    public boolean send(String text, Object user, String country) {
        if (user instanceof FacebookUser) {
            if (((FacebookUser) user).getUserCountry().equals(country)){
                System.out.println("Facebook message sent");
                return true;
            }
        }
        else if (user instanceof TwitterUser){
            System.out.println("Twitter message sent");
            return true;
        }
        return false;
    }
}


