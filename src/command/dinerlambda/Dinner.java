package command.dinerlambda;

public class Dinner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress, cook);
        customer.createOrder();
        customer.hungry();
    }
}
