package command.dinerlambda;

public class Customer {
    Waitress waitress;
    Order order;
    Cook cook;
    public Customer(Waitress waitress, Cook cook) {
        this.waitress = waitress;
        this.cook = cook;
    }
    public void createOrder() {
       this.order = () -> { cook.makeBurger(); cook.makeFries(); };
    }
    public void hungry() {
        waitress.takeOrder(order);
    }
}
