package Start;

import Server.Server;
import javafx.application.Application;
import javafx.stage.Stage;

public class ServerStart extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Server server=new Server();
        server.run();
    }
}
