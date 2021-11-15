package sender;
import twitter.TwitterUser;

import java.util.Date;
public class MyTwitterUser implements User{
    private TwitterUser user;

    @Override
    public String getCountry(){
        return user.getUserCountry();
    }

    @Override
    public Date getDate(){
        return user.getUserActiveTime();
    }

    @Override
    public String getEmail(){
        return user.getEmail();
    }

}
