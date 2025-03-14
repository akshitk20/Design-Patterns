package abstractfactory;

public class WebDeveloper extends Employee implements AbstractEmployeeFactory {

    public WebDeveloper() {
        //name = "Web Developer";
    }

    @Override
    public int getSalary() {
        System.out.println("Salary of Web developer");
        return 10000;
    }

    @Override
    public Employee getEmployee() {
        return new WebDeveloper();
    }

    @Override
    public String getName() {
        return "Web Dev";
    }
}
