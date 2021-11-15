import facebook.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterAdapter;
import twitter.TwitterUser;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class TwitterAdapterTest {
    TwitterUser tw_user;
    TwitterAdapter tw_adapter;

    @BeforeEach
    void setUp() {
        tw_user = new TwitterUser("notme@gmail.com", "Tatarstan", new Date());
        tw_adapter = new TwitterAdapter(tw_user);
    }

    @Test
    void getUserEmail() {
        assertEquals(tw_adapter.getEmail(), "notme@gmail.com");
    }
    @Test
    void check() {
        assertEquals(tw_user.getEmail(), tw_adapter.getEmail());
        assertEquals("Tatarstan", tw_adapter.getCountry());
    }
}
