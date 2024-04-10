package github.guimaraesp.cafe.springconcepts.otherTests;

public class UserRepository {
    public void saveUser(User user) {
        System.out.println("Saving user with name: " + user.getName());
    }
}
