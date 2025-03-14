package factory.employee;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee webDeveloper = employeeFactory.getEmployee("Web Developer");
        System.out.println(webDeveloper.name);
        System.out.println(webDeveloper.salary());

        Employee androidDeveloper = employeeFactory.getEmployee("Android Developer");
        System.out.println(androidDeveloper.name);
        System.out.println(androidDeveloper.salary());
    }
}
