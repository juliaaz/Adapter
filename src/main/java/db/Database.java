package db;

public class Database extends БазаДаних {
    public БазаДаних db;
    public Database (БазаДаних db) {
        this.db = db;
    }
    public String getUserData() {
        return db.отриматиДаніКористувача();
    }
    public String getStaticData() {
        return db.отриматиСтатистичніДані();
    }
}
