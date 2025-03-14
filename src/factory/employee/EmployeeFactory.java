package factory.employee;

public class EmployeeFactory {

    public Employee getEmployee(String name) {
        Employee employee = null;
        if (name.equals("Web Developer")) {
            employee = new WebDeveloper();
        } else if (name.equals("Android Developer")) {
            employee = new AndroidDeveloper();
        }
        return employee;
    }
}
