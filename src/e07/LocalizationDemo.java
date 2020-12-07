package e07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocalizationDemo {

    public static void main(String[] args) throws IOException {

        // System.out.println("Labas rytas");

        Properties properties = new Properties();
        String fileName = "src" + File.separator +
                "e07" + File.separator +
                "app-config.properties";
        System.out.println("File name: " + fileName);
        properties.load(new FileInputStream(fileName));

        System.out.println(properties);

        String loop = properties.getProperty("loop");
        int loopCnt = Integer.parseInt(loop);

        for (int i = 0; i < loopCnt; i++) {
            System.out.println(properties.getProperty("app-name"));
        }

    }
}
