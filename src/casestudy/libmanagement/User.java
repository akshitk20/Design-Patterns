package casestudy.libmanagement;

public class User implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Received notification");
    }
}
