package lt.turnyras;

import lt.bit.TournamentUtils;
import lt.bit.Turnyras;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;

public class PlayersCountTest {

    @Test
    public void testNextRound() {

//        class TurnyrasTest extends Turnyras {
//
//            public TurnyrasTest(InputStream is, OutputStream out) {
//                super(is, out);
//            }
//
//            @Override
//            public int playersCountInNextRound(int totalPlayers) {
//                return super.playersCountInNextRound(totalPlayers);
//            }
//        }
//
//        TurnyrasTest t = new TurnyrasTest(null, null);

        Assert.assertEquals(0, TournamentUtils.playersCountInNextRound(-1));
        Assert.assertEquals(0, TournamentUtils.playersCountInNextRound(0));
        Assert.assertEquals(0, TournamentUtils.playersCountInNextRound(1));
        Assert.assertEquals(0, TournamentUtils.playersCountInNextRound(2));
        Assert.assertEquals(1, TournamentUtils.playersCountInNextRound(3));
        Assert.assertEquals(0, TournamentUtils.playersCountInNextRound(4));
        Assert.assertEquals(3, TournamentUtils.playersCountInNextRound(5));
        Assert.assertEquals(2, TournamentUtils.playersCountInNextRound(6));
        Assert.assertEquals(1, TournamentUtils.playersCountInNextRound(7));
        Assert.assertEquals(0, TournamentUtils.playersCountInNextRound(8));
        Assert.assertEquals(7, TournamentUtils.playersCountInNextRound(9));
        Assert.assertEquals(6, TournamentUtils.playersCountInNextRound(10));
    }

    @Test
    public void testRoundCount() {
        Assert.fail("TODO");
    }
}
