package playground.casestudyemployepayroll;

public class SalariedEmployeeType implements EmployeeType {
    private PaymentService paymentService;
    private NotificationService notificationService;

    public SalariedEmployeeType(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    @Override
    public void calculateSalary(Employee employee) {
        System.out.println("Calculating Salary for Salaried employee " + employee.name);
        // do salary calculation
        int base = 10;
        employee.salary = base * 30;
        paymentService.doPayment(employee.salary);
        notificationService.sendNotification(String.valueOf(employee.salary));
    }
}
