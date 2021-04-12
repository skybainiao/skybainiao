package NetWork;

import Shared.Bike;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable{
    private Client client;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public ClientHandler(Socket socket,Client client){
        this.socket=socket;
        this.client=client;
        try {
            out=new ObjectOutputStream(socket.getOutputStream());
            in=new ObjectInputStream(socket.getInputStream());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void run(){
        try {
            int id=(int)in.readObject();
            client.setId(id);

            while (true){
                Bike bike=(Bike)in.readObject();
                client.receiveBike(bike);
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addBikeToServer(Bike bike){
        try {
            out.writeObject(bike);
            System.out.println(bike.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
