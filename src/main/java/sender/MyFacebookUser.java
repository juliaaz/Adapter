package sender;
import facebook.FacebookUser;
import java.util.Date;
public class MyFacebookUser implements User{
    private FacebookUser user;

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
