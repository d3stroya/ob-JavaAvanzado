import java.util.ArrayList;

public class DTOUsers {
    ArrayList<User> users = new ArrayList<>();

    public User getUser(String name) {
      for(User user : users) {
          if (user.name == name) {
              return user;
          }
      }
    }

    public void addUsers(User user) {
        users.add(user);
    }
}
