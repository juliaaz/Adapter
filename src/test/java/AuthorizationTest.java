import authorization.Authorization;
import authorization.Авторизація;
import db.БазаДаних;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AuthorizationTest {
    Authorization authorization;
    Авторизація authorization_ukr;
    БазаДаних db;
    @BeforeEach
    void setUp() {
        db = new БазаДаних();
        authorization_ukr = new Авторизація();
        authorization = new Authorization(authorization_ukr);
    }

    @Test
    void authorizationTest(){
        assertEquals(authorization_ukr.авторизуватися(db), authorization.authorize(db));
    }

    @Test
    void authorizationTest2(){
        assertEquals(authorization.authorize(db), true);
    }
}
