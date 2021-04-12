package Shared;

public class Message extends User{
    private String text;

    public Message(String userName,String text){
        super(userName);
        this.text=text;
    }

    @Override
    public String setUserName(String userName) {
        super.setUserName(userName);
        return userName;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }
}

