package structural.facade;

public class Test {
    public static void main(String[] args) {
        DBHelperFacade helperFacade = new DBHelperFacade();
        System.out.println(helperFacade.queryTable(DBHelperFacade.DBType.ORACLE, "hehe"));
    }
}
