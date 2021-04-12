package Start;

import Factory.ModelFactory;
import Factory.ViewModelFactory;
import NetWork.Client;
import View.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

public class ClientStart extends Application {
    private Client client=new Client();

    @Override
    public void start(Stage stage) throws Exception {
        client.runClient();
        ModelFactory modelFactory=new ModelFactory();
        ViewModelFactory viewModelFactory=new ViewModelFactory(modelFactory);
        ViewHandler viewHandler=new ViewHandler(viewModelFactory,client);
        viewHandler.openLoginView();
    }
}
