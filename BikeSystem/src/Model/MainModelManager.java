package Model;

import NetWork.Client;
import Shared.Bike;
import Shared.Message;
import Shared.User;

public class MainModelManager implements MainModel {
    private User user;
    private Message message;
    private Bike bike;
    private Client client;

    public MainModelManager(){
        this.client=new Client();
        this.user=new User("");
        this.message=new Message("","");
        this.bike=new Bike(0,"","","","");
    }
    @Override
    public String setUsername(String username) {
        String result=user.setUserName(username);
        return result;
    }

    @Override
    public String getUsername() {
        String result=user.getUserName();
        return result;
    }

    @Override
    public String setPrice(String price) {
        String result = bike.setPrice(price);
        return result;
    }

    @Override
    public String setOwnersPhoneNumber(String ownersPhoneNumber) {
        String result = bike.setOwnersPhoneNumber(ownersPhoneNumber);
        return result;
    }

    @Override
    public String setOwnerName(String ownerName) {
        String result = bike.setOwnerName(ownerName);
        return result;
    }

    @Override
    public String setDescription(String description) {
        String result = bike.setDescription(description);
        return result;
    }


    @Override
    public void setChatUsername(String username) {
        message.setUserName(username);
    }

    @Override
    public String getChatUsername() {
        String result=message.getUserName();
        return result;
    }

    @Override
    public void setText(String text) {
        message.setText(text);
    }

    @Override
    public String getText() {
        String result=message.getText();
        return result;
    }

    @Override
    public void setId(int id) {
        bike.setId(id);
    }

    @Override
    public void increase() {
        bike.increase();
    }

    @Override
    public int getId() {
        return bike.getId();
    }

    @Override
    public String getPrice() {
        String result=bike.getPrice();
        return result;
    }

    @Override
    public String getOwnersPhoneNumber() {
        String result=bike.getOwnersPhoneNumber();
        return result;
    }

    @Override
    public String getDescription() {
        String result=bike.getDescription();
        return result;
    }

    @Override
    public String getOwnerName() {
        String result=bike.getOwnerName();
        return result;
    }


}
