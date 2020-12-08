package e08;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlArYraLietuva {

    public static void main(String[] args) {
        System.out.println("Testas LT: ĄČĘĖĮŠŲŪŽ");

        try {
            URL url = new URL("https://lt.wikipedia.org/wiki/Lietuva");

            InputStream is = url.openStream();
            InputStreamReader reader = new InputStreamReader(is, "UTF-8");

            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                // System.out.print((char)c);
                sb.append((char)c);
            }
            //TODO galiu cia atlikti reikalinga paieska

            System.out.println(sb.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
