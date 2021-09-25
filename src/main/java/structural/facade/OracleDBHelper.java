package structural.facade;

public class OracleDBHelper {
    public String queryTable(String table) {
        return "data from oracle table:" + table;
    }
}
