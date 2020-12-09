package e08_09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Turnyras {

    private final InputStream is;
    private final OutputStream out;


    public Turnyras(InputStream is, OutputStream out) {
        this.is = is;
        this.out = out;
    }

    public void execute() {
        List<String> players = read(this.is);
        System.out.println(players);

        players = randomize(players);
        System.out.println(players);

        int roundsCount = rounds(players);
        System.out.println("Viso turu yra " + roundsCount);
    }

    private List<String> read(InputStream is) {
        List<String> players = new ArrayList<>();

        try (
                InputStreamReader reader = new InputStreamReader(new BufferedInputStream(is),
                        "UTF-8");
        ) {

            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = reader.read()) != -1) {
                sb.append((char)c);
                if (c == '\n') {
                    String name = sb.toString();
                    if (name.trim().length() > 0) {
                        players.add(name.trim());
                    }
                    sb = new StringBuilder();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return players;
    }

    private List<String> randomize(List<String> list) {
        Random random = new Random();
        for (int i = 0; i < list.size() * 2; i++) {
            int index = random.nextInt(list.size());
            String name = list.remove(index);
            list.add(0, name);
        }
        return list;
    }

    //  2  - 1
    //  3 4  - 2
    //  5 6 7 8 - 3
    //  9 10 11 12 13 14 15 16 - 4
    private int rounds(List<String> players) {
        if (players == null || players.size() <= 1) return 0;

        final int playersSize = players.size();
        int playersCount = 2;
        int roundCount = 1;
        while (playersSize > playersCount) {
            playersCount *= 2;
            roundCount++;
        }
        return roundCount;
    }

    //

}
