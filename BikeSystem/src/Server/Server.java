package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
    private Pool pool=new Pool();

    @Override
    public void run() {
        while (true){
            try {
                ServerSocket serverSocket=new ServerSocket(7777);
                int id=0;

                while (true){
                    Socket socket=serverSocket.accept();
                    ServerHandler serverHandler=new ServerHandler(this,socket,id);
                    pool.addConn(serverHandler);
                    id++;
                    Thread thread=new Thread(serverHandler);
                    thread.start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Pool getPool() {
        return pool;
    }
}
