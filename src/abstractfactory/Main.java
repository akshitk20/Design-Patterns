package abstractfactory;

public class Main {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee employee = employeeFactory.getEmployee(new AndroidDeveloper());
        System.out.println(employee.getName() + " " +employee.getSalary());

        Employee employee1 = employeeFactory.getEmployee(new WebDeveloper());
        System.out.println(employee1.getName() + " " +employee1.getSalary());
    }
}
