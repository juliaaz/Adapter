package facebook;
import lombok.Setter;
import sender.User;

import java.util.Date;
@Setter
public class FacebookAdapter implements User{
    private FacebookUser facebookUser;

    public FacebookAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    public String getEmail(){
        return facebookUser.getEmail();
    }

    public String getCountry(){
        return facebookUser.getUserCountry();
    }

    public Date getDate() {
        return facebookUser.getUserActiveTime();
    }
}
