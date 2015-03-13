package ClientServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MultiThread implements Runnable
{
    private Socket clientSocket;

    public MultiThread(Socket clientSocket)
    {
	this.clientSocket=clientSocket;
    }

    @Override
    public void run()
    {
	System.out.printf("��%s�s�u�i��!\n",clientSocket.getRemoteSocketAddress());
	DataInputStream input=null;
	DataOutputStream output=null;

	try
	{
	    input=new DataInputStream(clientSocket.getInputStream());
	    output=new DataOutputStream(clientSocket.getOutputStream());
	    while (true)
	    {
		output.writeUTF(String.format("Hi, %s!\n",clientSocket.getRemoteSocketAddress()));// PUT��client2��
		output.flush();
		// TODO �B�zIO�A�o��w�qprotocol��w�I�I
		break;
	    }

	}
	catch (IOException e)
	{
	    // TODO �۰ʲ��ͪ� catch �϶�
	    e.printStackTrace();
	}

    }

}
