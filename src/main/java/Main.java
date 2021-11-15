import db.*;
import authorization.*;
import report.ReportBuilder;
public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        Database database = new Database(db);
        Авторизація авторизація = new Авторизація();
        Authorization authorization = new Authorization(авторизація);
        if (authorization.authorize(database)) {
            ReportBuilder report_builder = new ReportBuilder(database);
        }
    }
}