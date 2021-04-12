package View;

import NetWork.Client;
import Shared.Bike;
import ViewModel.HomePageVM;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HomePageView {
    private HomePageVM homePageVM;
    private ViewHandler viewHandler;
    private Client client;
    @FXML
    Label price;
    @FXML
    Label ownerPN;
    @FXML
    Label ownerName;
    @FXML
    Label description;
    @FXML
    ListView<Bike> listView;
    @FXML
    TextField setPrice;
    @FXML
    TextField setOwnerPhoneNumber;
    @FXML
    TextField setOwnerName;
    @FXML
    TextArea setDescription;
    @FXML
    Button priceButton;
    @FXML
    Button ownerPNButton;
    @FXML
    Button ownerNameButton;
    @FXML
    Button desButton;
    @FXML
    Button addButton;

    public HomePageView(){

    }

    public void init(HomePageVM homePageVM,ViewHandler viewHandler,Client client){
        this.client=client;
        this.homePageVM=homePageVM;
        this.viewHandler=viewHandler;
        setPrice.textProperty().bindBidirectional(homePageVM.getPrice());
        setOwnerPhoneNumber.textProperty().bindBidirectional(homePageVM.getOwnerPN());
        setOwnerName.textProperty().bindBidirectional(homePageVM.getOwnerName());
        setDescription.textProperty().bindBidirectional(homePageVM.getDescription());
        price.textProperty().bindBidirectional(homePageVM.getLPrice());
        ownerName.textProperty().bindBidirectional(homePageVM.getLOwnerName());
        ownerPN.textProperty().bindBidirectional(homePageVM.getLOwnerPN());
        description.textProperty().bindBidirectional(homePageVM.getLDescription());
    }

    public void addBike(){
        Bike bike=new Bike(homePageVM.getID(), setPrice.getText(),setOwnerPhoneNumber.getText(),setOwnerName.getText(),setDescription.getText());
        client.addBike(bike);
        listView.getItems().add(bike);
        homePageVM.increase();
        homePageVM.desClear();
        homePageVM.ownerNameClear();
        homePageVM.ownerPNClear();
        homePageVM.priceClear();
    }

    public void enterPrice(){
        String result=setPrice.getText();
        homePageVM.setPrice(result);
    }

    public void enterOwnerPN(){
        String result=setOwnerPhoneNumber.getText();
        homePageVM.setOwnerPN(result);
    }

    public void enterOwnerName(){
        String result=setOwnerName.getText();
        homePageVM.setOwnerName(result);
    }

    public void enterDescription(){
        String result=setDescription.getText();
        homePageVM.setDescription(result);
    }


}
