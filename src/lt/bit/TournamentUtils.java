package lt.bit;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface TournamentUtils {

    static List<IParticipantName> read(InputStream is) {
        List<IParticipantName> players = new ArrayList<>();

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
                        // players.add(name.trim());
                        Player player = new Player(name.trim());
                        players.add(player);
                    }
                    sb = new StringBuilder();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return players;
    }

    static List<IParticipantName> randomize(List<IParticipantName> list) {
        Random random = new Random();
        for (int i = 0; i < list.size() * 2; i++) {
            int index = random.nextInt(list.size());
            IParticipantName name = list.remove(index);
            list.add(0, name);
        }
        return list;
    }

    //  2  - 1
    //  3 4  - 2
    //  5 6 7 8 - 3
    //  9 10 11 12 13 14 15 16 - 4
    static int rounds(int totalPlayers) {
        if (totalPlayers <= 1) return 0;

        int playersCount = 2;
        int roundCount = 1;
        while (playersCount < totalPlayers) {
            playersCount *= 2;
            roundCount++;
        }
        return roundCount;
    }

    static int playersCountInNextRound(int totalPlayers) {
        if (totalPlayers <= 2) return 0;
        int roundsCount = rounds(totalPlayers);
        int maxPlayers = (int) Math.pow(2, roundsCount);
        int nextRoundPlayers = maxPlayers - totalPlayers;
        return nextRoundPlayers;
    }

}
