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
	System.out.printf("有%s連線進來!\n",clientSocket.getRemoteSocketAddress());
	DataInputStream input=null;
	DataOutputStream output=null;

	try
	{
	    input=new DataInputStream(clientSocket.getInputStream());
	    output=new DataOutputStream(clientSocket.getOutputStream());
	    while (true)
	    {
		output.writeUTF(String.format("Hi, %s!\n",clientSocket.getRemoteSocketAddress()));// PUT給client2端
		output.flush();
		// TODO 處理IO，這邊定義protocol協定！！
		break;
	    }

	}
	catch (IOException e)
	{
	    // TODO 自動產生的 catch 區塊
	    e.printStackTrace();
	}

    }

}
