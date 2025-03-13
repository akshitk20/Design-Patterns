package playground.casestudyemployepayroll;

public class ContractorEmployeeType implements EmployeeType {
    PaymentService paymentService;
    NotificationService notificationService;

    public ContractorEmployeeType(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    @Override
    public void calculateSalary(Employee employee) {
        int base = 10;
        employee.salary = base * 30;
        paymentService.doPayment(employee.salary);
        notificationService.sendNotification(String.valueOf(employee.salary));
    }
}
