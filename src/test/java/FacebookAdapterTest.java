import facebook.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class FacebookAdapterTest {
    FacebookUser fb_user;
    FacebookAdapter fb_adapter;

    @BeforeEach
    void setUp() {
        fb_user = new FacebookUser("me@gmail.com", "Ukraine", new Date());
        fb_adapter = new FacebookAdapter(fb_user);
    }

    @Test
    void getUserEmail() {
        assertEquals(fb_adapter.getEmail(), "me@gmail.com");
    }
    @Test
    void check() {
        assertEquals(fb_user.getEmail(), fb_adapter.getEmail());
        assertEquals("Ukraine", fb_adapter.getCountry());
    }
}
