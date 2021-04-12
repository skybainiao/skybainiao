package NetWork;

import Shared.Bike;
import View.HomePageView;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Client {
    private int id;
    private ClientHandler clientHandler;
    private ArrayList<Bike> allBikes=new ArrayList<>();
    private HomePageView homePageView;

    public void runClient(){
        try {
            Socket socket=new Socket("127.0.0.1",7777);
            clientHandler=new ClientHandler(socket,this);
            Thread thread=new Thread(clientHandler);
            thread.setDaemon(true);
            thread.start();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void setHomePageView(HomePageView homePageView){
        this.homePageView=homePageView;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addBike(Bike bike){
        clientHandler.addBikeToServer(bike);
    }

    public void receiveBike(Bike bike){
        System.out.println("receive bike from: "+bike.getId());
        allBikes.add(bike);
//        chatViewController.updatesMessage();
    }
}
