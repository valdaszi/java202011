package lt.bit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Ka mes turime gauti, jei pvz turim 7 zaidejus:
 * 1 Turas:
 *      1) Jonas - Petras
 *      2) Kazys - Ona
 *      3) Maryte - Antanas
 * 2 Turas:
 *      4) Egle - 1 poros laimetojas
 *      5) 2 poros laimetojas - 3 poros laimetojas
 * 3 Turas:
 *      6) 4 poros laimetojas - 5 poros laimetojas
 *
 * <p>
 * 2, 4, 8, 16 ....
 *
 * <p>
 * 2 -> 2x1  OK   -> 0 + 2 = 2
 * 3 -> 2x1 + 1   -> 1 + 3 = 4
 * 4 -> 2x2 OK    -> 0 + 4 = 4
 * 5 -> 2x1 + 3   -> 3 + 5 = 8
 * 6 -> 2x2 + 2   -> 2 + 6 = 8
 * 7 -> 2x3 + 1   -> 1 + 7 = 8
 * 8 -> 2x4 OK    -> 0 + 8 = 8
 * 9 -> 2x1 + 7   -> 7 + 9 = 16
 * 10 -> 2x2 + 6   -> 6 + 10 = 16
 */
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

        int roundsCount = rounds(players.size());
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
                sb.append((char) c);
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
    protected int rounds(int totalPlayers) {
        if (totalPlayers <= 1) return 0;

        int playersCount = 2;
        int roundCount = 1;
        while (playersCount < totalPlayers) {
            playersCount *= 2;
            roundCount++;
        }
        return roundCount;
    }

    //
    protected int playersCountInNextRound(int totalPlayers) {
        if (totalPlayers <= 2) return 0;
        int roundsCount = rounds(totalPlayers);
        int maxPlayers = (int) Math.pow(2, roundsCount);
        int nextRoundPlayers = maxPlayers - totalPlayers;
        return nextRoundPlayers;
    }

}
