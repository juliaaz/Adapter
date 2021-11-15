import db.Database;
import db.БазаДаних;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DatabaseTest {
    БазаДаних db_ukr;
    Database db;
    @BeforeEach
    void setUp() {
        db_ukr = new БазаДаних();
        db = new Database(db_ukr);
    }

    @Test
    void getUserData() {
        assertEquals(db.getUserData(), db_ukr.отриматиДаніКористувача());
    }

    @Test
    void getUserData2() {
        assertEquals(db.getUserData(), "hello");
    }

    @Test
    void getStaticData() {
        assertEquals(db.getStaticData(), db_ukr.отриматиСтатистичніДані());
    }

    @Test
    void getStatisticData2() {
        assertEquals(db.getStaticData(), "hello2");
    }



}
