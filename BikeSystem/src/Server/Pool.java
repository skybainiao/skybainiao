package Server;

import Shared.Bike;
import java.util.ArrayList;
import java.util.List;

public class Pool {
    private List<ServerHandler> connections;

    public Pool()
    {
        connections =  new ArrayList<>();
    }

    public synchronized void broadcast(int id,String price,String ownersPhoneNumber,String ownerName,String description)
    {
        Bike bike=new Bike(id, price, ownersPhoneNumber, ownerName, description);
        for(ServerHandler conn: connections )
        {
            conn.addBike(bike);
        }
    }
    public synchronized void  addConn(ServerHandler ssh)
    {
        connections.add(ssh);
    }
    public synchronized void  removeConn(ServerHandler ssh)
    {
        connections.remove(ssh);
    }
}
