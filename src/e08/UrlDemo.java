package e08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {

    public static void main(String[] args) {

        // https://lt.wikipedia.org/wiki/Lietuva

        try {
            URL url = new URL("https://lt.wikipedia.org/wiki/Lietuva");
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream("c.txt");

            int c;
            while( (c = is.read()) != -1) {
                os.write(c);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
