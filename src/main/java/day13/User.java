package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;

    private List<User> userSubscriptions;

    public User(String username) {
        this.username = username;
        this.userSubscriptions = new ArrayList<>();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserSubscriptions(List<User> userSubscriptions) {
        this.userSubscriptions = userSubscriptions;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getUserSubscriptions() {
        return userSubscriptions;
    }

    public void subscribe(User user){
      userSubscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        return userSubscriptions.contains(user);
    }

    public boolean isFriend(User user){
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString(){
        return "username: " + username;
    }
}
