import java.util.HashMap;
import java.util.Objects;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {

        HashMap <User, String> h = new HashMap();

        User user1 = new User("one");
        User user2 = new User("two");
        h.put(user1,"one");
        h.put(user2,"two");

        System.out.println(user1.equals(user1));


    }
}