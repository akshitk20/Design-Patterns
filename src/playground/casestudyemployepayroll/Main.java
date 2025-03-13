package playground.casestudyemployepayroll;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new BankTransfer();
        PaymentService paymentService = new PaymentService(paymentProcessor);
        Notification notification = new SMS();
        NotificationService notificationService = new NotificationService(notification);

        Employee employee = new Employee("Bob");
        EmployeeType employeeType = new SalariedEmployeeType(paymentService, notificationService);
        employeeType.calculateSalary(employee);
    }
}
