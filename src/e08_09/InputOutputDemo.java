package e08_09;

import java.io.*;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) {

        System.out.println("Start");
        long startTime = System.nanoTime(); // 1s = 10^9 nano
        long startTime2 = System.currentTimeMillis();

        try {
            InputStream is = new BufferedInputStream(
                    new FileInputStream("resources" + File.separator + "wiki-lietuva.html"),
                    500000);
            OutputStream os = new BufferedOutputStream(
                    new FileOutputStream("resources" + File.separator + "copy.txt"),
                    500000);

            int c;
            while( (c = is.read()) != -1) {
                os.write(c);
            }

//            os.flush();

            is.close();
            os.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long endTime2 = System.currentTimeMillis();

        System.out.println((endTime - startTime)/1_000_000L + "ms");
        System.out.println((endTime2 - startTime2) + "ms");

        System.out.println("Norint baigti, iveskite ka nors ir paspauskite <Enter>");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

    }
}
