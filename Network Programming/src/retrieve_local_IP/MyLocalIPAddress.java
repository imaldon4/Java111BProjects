package retrieve_local_IP;
import java.net.*;

/**
 * This uses the InetAddress class in the java.net library and uses the 
 * .getLocalHost() class in order to retrieve the local host machine
 * IP address. We use the object address and (I think because of 
 * the .toString method included in the InetAddress class) prints
 * by simply including the object in a print line. Lastly, we catch
 * the exception for host error.
 * @author imald
 * @version 10/12/18
 *
 */
public class MyLocalIPAddress {
	public static void main(String[]args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
		}
		catch (UnknownHostException uhEx) {
			System.out.println("Could not find local address!");
		}
	}
}
