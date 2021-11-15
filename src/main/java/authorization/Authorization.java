package authorization;
import db.*;
public class Authorization extends Авторизація{

    public Авторизація auth;

    public Authorization(Авторизація auth) {
        this.auth = auth;
    }

    public boolean authorize(БазаДаних db) {
        return auth.авторизуватися(db);
    }
}
