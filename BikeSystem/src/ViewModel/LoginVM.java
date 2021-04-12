package ViewModel;

import Model.MainModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class LoginVM {
    private MainModel mainModel;
    private StringProperty label;
    private StringProperty loginUsername;
    private StringProperty getIn;

    public LoginVM(MainModel mainModel){
        this.mainModel = mainModel;
        this.label=new SimpleStringProperty("Username :");
        this.loginUsername=new SimpleStringProperty();
        this.getIn=new SimpleStringProperty("Get in");
    }

    public void setUsername(String username){
        loginUsername.setValue(mainModel.setUsername(username));
    }

    public void clear(){
        loginUsername.setValue("");
    }

    public boolean validLogin(){
        if (loginUsername.get()==null){
            return false;
        }
        else return true;
    }

    public StringProperty getLabel(){
        return label;
    }

    public StringProperty getUsername(){
        return loginUsername;
    }

    public StringProperty getGetIn(){
        return getIn;
    }
}
