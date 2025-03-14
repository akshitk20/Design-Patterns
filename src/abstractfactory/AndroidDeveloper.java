package abstractfactory;

public class AndroidDeveloper extends Employee implements AbstractEmployeeFactory {

    public AndroidDeveloper() {
        //name = "Android Developer";
    }

    @Override
    public int getSalary() {
        System.out.println("Android developer salary");
        return 10000;
    }

    @Override
    public Employee getEmployee() {
        return new AndroidDeveloper();
    }

    @Override
    public String getName() {
        return "Android Dev";
    }
}
