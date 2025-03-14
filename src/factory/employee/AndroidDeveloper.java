package factory.employee;

public class AndroidDeveloper extends Employee {
    public AndroidDeveloper() {
        name = "Android Developer";
    }

    @Override
    public int salary() {
        System.out.println("Android developer salary");
        return 50000;
    }
}
