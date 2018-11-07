import java.net.*;
import java.util.*;

/**
 * Will use the method getByName to retrieve IP addresses of a specified
 * host and return via the .toString method.
 * @author imald
 * @version 10/12/18
 *
 */
public class IPFinder {
	public static void main(String[]args) {
		
		String host;
		Scanner input = new Scanner(System.in);
		InetAddress address;
		
		System.out.print("\n\nEnter host name: ");
		host = input.next();
		
		try {
			address = InetAddress.getByName(host);
			System.out.println("IP address: " + address.toString());
		}
		catch(UnknownHostException uhEx) {
			System.out.println("Could not find " + host);
		}
	}

}

//method: getByName to retrieve IP addres of a specified host
