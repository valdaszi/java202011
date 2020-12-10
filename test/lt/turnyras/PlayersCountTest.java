package lt.turnyras;

import lt.bit.Turnyras;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;

public class PlayersCountTest {

    @Test
    public void testNextRound() {

        class TurnyrasTest extends Turnyras {

            public TurnyrasTest(InputStream is, OutputStream out) {
                super(is, out);
            }

            @Override
            public int playersCountInNextRound(int totalPlayers) {
                return super.playersCountInNextRound(totalPlayers);
            }
        }

        TurnyrasTest t = new TurnyrasTest(null, null);

        Assert.assertEquals(0, t.playersCountInNextRound(-1));
        Assert.assertEquals(0, t.playersCountInNextRound(0));
        Assert.assertEquals(0, t.playersCountInNextRound(1));
        Assert.assertEquals(0, t.playersCountInNextRound(2));
        Assert.assertEquals(1, t.playersCountInNextRound(3));
        Assert.assertEquals(0, t.playersCountInNextRound(4));
        Assert.assertEquals(3, t.playersCountInNextRound(5));
        Assert.assertEquals(2, t.playersCountInNextRound(6));
        Assert.assertEquals(1, t.playersCountInNextRound(7));
        Assert.assertEquals(0, t.playersCountInNextRound(8));
        Assert.assertEquals(7, t.playersCountInNextRound(9));
        Assert.assertEquals(6, t.playersCountInNextRound(10));
    }

    @Test
    public void testRoundCount() {
        Assert.fail("TODO");
    }
}
