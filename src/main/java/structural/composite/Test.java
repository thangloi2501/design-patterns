package structural.composite;

public class Test {
    public static void main(String[] args) {
        Employee staff1 = new Staff("aaa1");
        Employee staff2 = new Staff("aaa2");

        Department staffDep = new Department();
        staffDep.add(staff1);
        staffDep.add(staff2);

        Employee manager1 = new Manager("bbb1");
        Employee manager2 = new Manager("bbb2");
        Department manDep = new Department();
        manDep.add(manager1);
        manDep.add(manager2);

        System.out.println(staffDep.details());
        System.out.println(manDep.details());
    }
}
