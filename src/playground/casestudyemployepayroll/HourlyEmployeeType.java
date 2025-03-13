package playground.casestudyemployepayroll;

public class HourlyEmployeeType implements EmployeeType {
    PaymentService paymentService;
    NotificationService notificationService;

    public HourlyEmployeeType(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    @Override
    public void calculateSalary(Employee employee) {
        //calculate hourly salary
        int base = 10;
        employee.salary = base * 60*60;
        paymentService.doPayment(employee.salary);
        notificationService.sendNotification(String.valueOf(employee.salary));
    }
}
