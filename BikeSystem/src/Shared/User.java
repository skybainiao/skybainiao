package Shared;

public class User {
    private String userName;

    public User(String userName){
        this.userName=userName;
    }

    public String setUserName(String userName) {
        this.userName = userName;
        return userName;
    }

    public String getUserName() {
        return userName;
    }
}
