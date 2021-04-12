package View;

import ViewModel.LoginVM;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class LoginView {
    private LoginVM loginVM;
    private ViewHandler viewHandler;
    @FXML
    Label label;
    @FXML
    TextField username;
    @FXML
    Label getIn;

    public void init(LoginVM loginVM,ViewHandler viewHandler){
        this.loginVM=loginVM;
        this.viewHandler=viewHandler;
        label.textProperty().bindBidirectional(loginVM.getLabel());
        username.textProperty().bindBidirectional(loginVM.getUsername());
        getIn.textProperty().bindBidirectional(loginVM.getGetIn());
    }


    public void setUsername(){
        loginVM.setUsername(username.getText());
        loginVM.clear();
        if (loginVM.validLogin()==true){
            viewHandler.openHomepageScene();
        }
        else{
            JOptionPane.showMessageDialog(null,"pls enter username","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
