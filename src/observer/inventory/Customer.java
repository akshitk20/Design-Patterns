package observer.inventory;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, int stock) {
        System.out.println("Hi "+ name+ " : "+ stockName +" has only " +stock+ " left");
    }
}
