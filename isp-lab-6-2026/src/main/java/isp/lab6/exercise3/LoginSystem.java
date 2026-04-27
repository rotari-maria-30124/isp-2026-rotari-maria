package isp.lab6.exercise3;

import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    private Set<User> users;
    private OnlineStore store;

    public LoginSystem(OnlineStore store){
        this.store=store;
        users=new HashSet<>();
    }
    public void register(String username, String password){
        users.add(new User(username, password));
    }
    public boolean login(String username, String password){
        for(User u:users){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                store.addSession(username);
                return true;
            }
        }
        return false;
    }
    public boolean logout(String username){
        store.removeSession(username);
        return true;
    }
}
