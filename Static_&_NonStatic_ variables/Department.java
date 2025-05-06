public class Department {

    static String departmentName = "HR";
    String employeeName;

    public static void main(String[] args) {

        Department department1 = new Department();
        department1.employeeName = "John";

        Department department2 = new Department();
        department2.employeeName = "Alice";

        Department.departmentName = "Marketing";

        System.out.println("Department : " + Department.departmentName);

        System.out.println("Employee 1 : " + department1.employeeName);

        System.out.println("Employee 2 : " + department2.employeeName);

    }
}