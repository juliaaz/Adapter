package twitter;
import lombok.Setter;
import java.util.Date;
import sender.User;
@Setter
public class TwitterAdapter implements User{
    private TwitterUser userObj;

    public TwitterAdapter(TwitterUser twUser) {
        this.userObj = twUser;
    }

    public String getEmail(){
        return userObj.getEmail();
    }

    public String getCountry(){
        return userObj.getUserCountry();
    }

    public Date getDate() {
        return userObj.getUserActiveTime();
    }


}
