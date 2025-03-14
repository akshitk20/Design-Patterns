package factory.employee;

public class WebDeveloper extends Employee {

    public WebDeveloper() {
        name = "Web Developer";
    }

    @Override
    public int salary() {
        System.out.println("Web developer salary");
        return 60000;
    }
}
