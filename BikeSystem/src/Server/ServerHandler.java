package Server;

import Shared.Bike;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerHandler implements Runnable{
    private Server server;
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private int id;

    public ServerHandler(Server server,Socket socket,int id){
        this.server=server;
        this.socket=socket;
        this.id=id;
        try {
            in=new ObjectInputStream(socket.getInputStream());
            out=new ObjectOutputStream(socket.getOutputStream());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        try {
            out.writeObject(id);
            while (true){
                Bike bike=(Bike)in.readObject();
                server.getPool().broadcast(bike.getId(),bike.getPrice(),bike.getOwnersPhoneNumber(),bike.getOwnerName(),bike.getDescription());
            }
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void addBike(Bike bike){
        try
        {
            out.writeObject(bike);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
