
import java.net.*;
public class Driver {

	public static void main(String[] args) {
		try {
			URL myURL = new URL("http://example.com/");
			System.out.println(myURL);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
