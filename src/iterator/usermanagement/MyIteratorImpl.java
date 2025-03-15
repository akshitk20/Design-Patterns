package iterator.usermanagement;

import java.util.List;

public class MyIteratorImpl implements MyIterator {
    List<User> users;
    int pos = 0;
    int size = 0;
    public MyIteratorImpl(List<User> users) {
        this.users = users;
        this.size = users.size();
    }

    @Override
    public boolean hasNext() {
        if (pos >= size) return false;
        else return true;
    }

    @Override
    public Object next() {
        User user = users.get(pos);
        pos+=1;
        return user;
    }
}
