package comparator;

import data.users.User;

import java.util.Comparator;

public class UserLastnameComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
