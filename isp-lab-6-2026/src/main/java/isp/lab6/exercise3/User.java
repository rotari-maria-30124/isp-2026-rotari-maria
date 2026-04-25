package isp.lab6.exercise3;

public class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public int hashCode() {
        return this.username.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return this.username.hashCode()==(((User) obj).username.hashCode());
    }
    @Override
    public String toString() {
        return "USER\n" + "\n" + "Username: " + username + "\n" + "\nPassword: " + password;
    }
}
