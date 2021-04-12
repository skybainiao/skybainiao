package ViewModel;

import Model.MainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HomePageVM {
    private MainModel model;
    private StringProperty lPrice;
    private StringProperty lOwnerPN;
    private StringProperty lOwnerName;
    private StringProperty lDescription;
    private StringProperty price;
    private StringProperty ownerPN;
    private StringProperty ownerName;
    private StringProperty description;

    public  HomePageVM(MainModel model){
        this.model=model;
        lPrice=new SimpleStringProperty("Pr :");
        lOwnerName=new SimpleStringProperty("ON :");
        lOwnerPN=new SimpleStringProperty("OPN :");
        lDescription=new SimpleStringProperty("Des :");
        price=new SimpleStringProperty();
        ownerPN=new SimpleStringProperty();
        ownerName=new SimpleStringProperty();
        description=new SimpleStringProperty();
    }

    public void priceClear(){
        price.setValue("");
    }

    public void ownerPNClear(){
        ownerPN.setValue("");
    }

    public void ownerNameClear(){
        ownerName.setValue("");
    }

    public void desClear(){
        description.setValue("");
    }

    public void increase(){
        model.increase();
    }

    public void setPrice(String priceM) {
        price.setValue(model.setPrice(priceM));
    }

    public void setOwnerPN(String ownerPNM) {
        ownerPN.setValue(model.setOwnersPhoneNumber(ownerPNM));
    }

    public void setOwnerName(String ownerNameM){
        ownerName.setValue(model.setOwnerName(ownerNameM));
    }

    public void setDescription(String descriptionM){
        description.setValue(model.setDescription(descriptionM));
    }

    public int getID(){
        return model.getId();
    }


    public StringProperty getPrice(){
        return price;
    }

    public StringProperty getOwnerPN(){
        return ownerPN;
    }

    public StringProperty getOwnerName(){
        return ownerName;
    }

    public StringProperty getDescription(){
        return description;
    }

    public StringProperty getLPrice(){
        return lPrice;
    }

    public StringProperty getLOwnerPN(){
        return lOwnerPN;
    }

    public StringProperty getLOwnerName(){
        return lOwnerName;
    }

    public StringProperty getLDescription(){
        return lDescription;
    }


}
