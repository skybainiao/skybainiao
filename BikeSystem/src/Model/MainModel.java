package Model;


public interface MainModel {
    String setUsername(String username);
    void increase();
    String setPrice(String price);
    String setOwnersPhoneNumber(String ownersPhoneNumber);
    String setOwnerName(String ownerName);
    String setDescription(String description);
    int getId();
    String getUsername();
    void setChatUsername(String username);
    String getChatUsername();
    void setText(String text);
    String getText();
    void setId(int id);
    String getPrice();
    String getOwnersPhoneNumber();
    String getDescription();
    String getOwnerName();
}
