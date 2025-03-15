package iterator.usermanagement;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("BOB",1));
        userManagement.addUser(new User("yelena",2));
        userManagement.addUser(new User("Alexei", 3));

        MyIterator iterator = userManagement.getIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println(user.getName());
        }
    }
}
