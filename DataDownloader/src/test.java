


import java.io.IOException;
import java.net.MalformedURLException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;

public class test {

    public static void main(final String[] args) {
        final WebClient webClient = new WebClient();
        webClient.setJavaScriptTimeout(1000);
        try {
            System.out.println("Querying");
            webClient.getPage("http://www.google.com");
            System.out.println("Success");
        } catch (final FailingHttpStatusCodeException e) {
            System.out.println("One");
            e.printStackTrace();
        } catch (final MalformedURLException e) {
            System.out.println("Two");
            e.printStackTrace();
        } catch (final IOException e) {
            System.out.println("Three");
            e.printStackTrace();
        } catch (final Exception e) {
            System.out.println("Four");
            e.printStackTrace();
        }
        System.out.println("Finished");
    }

}
