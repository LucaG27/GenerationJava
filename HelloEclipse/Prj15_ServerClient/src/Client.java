import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getByName(null);
		
		Socket socket = null;
		BufferedReader in=null;
		PrintWriter out = null;
		
	try { 
		socket = new Socket(addr, 9999);
		System.out.println("Client: sono partito in cerca della connessione ");
	}catch(Exception ex) {
		
	}
	
	}

}
