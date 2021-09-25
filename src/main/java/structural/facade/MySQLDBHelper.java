package structural.facade;

public class MySQLDBHelper {
    public String queryTable(String table) {
        return "data from mysql table:" + table;
    }
}
