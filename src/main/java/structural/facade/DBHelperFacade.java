package structural.facade;

public class DBHelperFacade {
    private OracleDBHelper oracleDBHelper = new OracleDBHelper();
    private MySQLDBHelper mySQLDBHelper = new MySQLDBHelper();

    public String queryTable(DBType dbType, String table) {
        if (dbType == DBType.ORACLE)
            return oracleDBHelper.queryTable(table);
        else
            return mySQLDBHelper.queryTable(table);
    }

    enum DBType {
        ORACLE, MYSQL
    }
}
