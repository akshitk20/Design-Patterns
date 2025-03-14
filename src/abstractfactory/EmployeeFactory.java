package abstractfactory;

public class EmployeeFactory {

    public Employee getEmployee(AbstractEmployeeFactory employeeFactory) {
        return employeeFactory.getEmployee();
    }
}
