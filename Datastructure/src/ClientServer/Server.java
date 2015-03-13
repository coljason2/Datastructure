package ClientServer;

import java.io.IOException;
import java.net.ServerSocket;

public class Server
{
    private static final int LISTEN_PORT=5987;
    private ServerSocket serverSocket=null;

    public Server() throws IOException
    {
	serverSocket=new ServerSocket(LISTEN_PORT);
	System.out.println("Server Start Success");
	while (true)
	{
	    serverSocket.accept();
	}
    }

    public static void main(String[] args)
    {

    }

}
