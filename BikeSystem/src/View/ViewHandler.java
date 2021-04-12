package View;

import Factory.ViewModelFactory;
import NetWork.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler {
    private Client client;
    private Stage stage;
    private ViewModelFactory viewModelFactory;


    public ViewHandler(ViewModelFactory viewModelFactory,Client client){
        this.client=client;
        this.viewModelFactory=viewModelFactory;
        this.stage=new Stage();
    }

    private Scene loginScene;
    public void openLoginView(){
        try {
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("LoginView.fxml"));
            Parent root=loader.load();
            LoginView loginView=loader.getController();
            loginView.init(viewModelFactory.getLoginVM(), this);
            stage.setTitle("Login");
            loginScene=new Scene(root);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        stage.setScene(loginScene);
        stage.show();
    }

    private Scene homepageScene;
    public void openHomepageScene(){
        try {
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("HomePageView.fxml"));
            Parent root=loader.load();
            HomePageView homePageView=loader.getController();
            client.setHomePageView(homePageView);
            homePageView.init(viewModelFactory.getHomePageVM(), this,client);
            stage.setTitle("HomePage");
            homepageScene=new Scene(root);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        stage.setScene(homepageScene);
        stage.show();
    }
}
