import facebook.*;
import twitter.*;
import sender.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

class MessageSenderTest {
    MessageSender msg_sender;
    FacebookUser fb_user;
    TwitterUser tw_user;
    FacebookAdapter fb_adapter;
    TwitterAdapter tw_adapter;
    @BeforeEach
    void setUp() {
        msg_sender = new MessageSender();
        tw_user = new TwitterUser("notme@gmail.com", "England", new Date());
        fb_user = new FacebookUser("me@gmail.com", "Ukraine", new Date());
        fb_adapter = new FacebookAdapter(fb_user);
        tw_adapter = new TwitterAdapter(tw_user);
    }

    @Test
    void testFBSender() {
        assertTrue(msg_sender.send("hello", fb_user, "Ukraine"));
    }

    @Test
    void testTWSender() {
        assertTrue(msg_sender.send("hello", tw_user, "England"));
    }
}
