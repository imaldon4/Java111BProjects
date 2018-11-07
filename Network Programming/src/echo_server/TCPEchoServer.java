package echo_server;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 * Server that echos back client's messages. At the end of dialogue,
 * sends message indicating number of messages received. Uses TCP.
 * @author imald
 * @version 10/13/18
 */
public class TCPEchoServer {
	
	//Create a ServerSocket object. The ServerSocket constructor
	//is set to port number 1234.
	
	private static ServerSocket serverSocket;
	private static final int PORT = 1234;
	
	public static void main(String[] args) {
		
		System.out.println("Opening port...\n");
		
		//Try to establish a serverSocket object and assign a port number.
		try {
			serverSocket = new ServerSocket(PORT); //Step 1.
		}
		
		//Catches input or output exceptions.
		catch (IOException ioEx) {
			System.out.println("Unable to attach to port!");
			//Why exit(1)?
			System.exit(1);
		}
		
		//make an infinite loop for the handleClient() method and
		//allow the client to terminate the loop if the client
		//sets the while loop to FALSE.
		do {
			handleClient();
		}while (true);
	}
	
	/**
	 * This method is meant to handle client interaction.
	 */
	private static void handleClient() {
		//Create a Socket object named link and assign to null.
		Socket link = null;
		
		//Use a try statement and use .accept() method of the
		//serverSocket class to create an object and assign it
		//the Socket link variable.
		try {
			link = serverSocket.accept();			//Step 2.
			
			//Use the Scanner class to take in input from LINK by using
			//the .getInputStreat() method of the ServerSocket class. 
			Scanner input = new Scanner(link.getInputStream()); //Step 3.
			
			//Create a PrintWriter object and use the .getOutputStream() method from
			//the ServerSocket class to print back to client any responding
			//commands necessary for the client to see on their end. 
			PrintWriter output = new PrintWriter(link.getOutputStream(), true); //Step 3.
			
			//Create a counter for number of messages.
			int numMessages = 0;
			
			//Create a message String variable and have any .nextLine() 
			//input sent into the .getInputStream() link object.
			String message = input.nextLine();		//Step 4.
			
			//Use a while statement in order to confirm that message is
			//not bing closed yet and count number of messages sent.
			while (!message.equals("***CLOSE***")) {
				System.out.println("Message received.");
				numMessages++;
				output.println("Message " + numMessages + ": " + message); //Step 4
			}
			
			output.println(numMessages + " messages received."); //Step 4.
		}
			
		//Catch any errors in input or output processing
		catch (IOException ioEx) {
			//This can trace an error
			ioEx.printStackTrace();
		}
		
		//Create a finally statement in order to finish connections.
		finally {
			try {
				System.out.println("\n* Closing connection... *");
				link.close();
			}
			catch (IOException ioEX) {
				System.out.println("Unable to disconnect!");
				System.exit(1);
			}
		}
	}
}

