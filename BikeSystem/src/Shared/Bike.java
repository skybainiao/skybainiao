package Shared;

public class Bike {
    private int id;
    private String price;
    private String ownersPhoneNumber;
    private String ownerName;
    private String description;

    public Bike(int id,String price,String ownersPhoneNumber,String ownerName,String description){
        this.id=id;
        this.price=price;
        this.ownersPhoneNumber=ownersPhoneNumber;
        this.ownerName=ownerName;
        this.description=description;
    }

    public void increase(){
        id++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String setPrice(String price) {
        this.price = price;
        return price;
    }

    public String setOwnersPhoneNumber(String ownersPhoneNumber) {
        this.ownersPhoneNumber = ownersPhoneNumber;
        return ownersPhoneNumber;
    }

    public String setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return ownerName;
    }

    public String setDescription(String description) {
        this.description = description;
        return description;
    }

    public int getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    public String getOwnersPhoneNumber() {
        return ownersPhoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return id+"  "+"Price: "+price+","+"OwnerName: "+ownerName+","+"PhoneNumber: "+ownersPhoneNumber+","+"Description: "+description;
    }
}
