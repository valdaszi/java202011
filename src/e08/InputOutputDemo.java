package e08;

import java.io.*;

public class InputOutputDemo {

    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("a.txt");
            OutputStream os = new FileOutputStream("b.txt");

//            int c = is.read(); // 0..255   -1 - jei failo pabaiga
//            while (c != -1) {
//                os.write(c);
//                c = is.read();
//            }

            int c;
            while( (c = is.read()) != -1) {
                os.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
