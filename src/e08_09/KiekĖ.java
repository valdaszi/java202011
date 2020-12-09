package e08_09;

import java.io.*;

public class KiekĖ {

    public static void main(String[] args) {

        try {
            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream("resources" + File.separator + "lt-8859-13.txt"),
                    "ISO-8859-13");

            int visoSimboliu = 0;
            int count = 0;
            int c;
            while((c = reader.read()) != -1) {
                visoSimboliu++;
                if (c == 'ė') {
                    count++;
                }
            }

            reader.close();

            System.out.println("Viso nuskaiteme " + visoSimboliu + " ir radome ė: " + count);


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
