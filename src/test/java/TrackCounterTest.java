import com.my.lei.spring.CompactDisc;
import com.my.lei.spring.TrackCointerConfig;
import com.my.lei.spring.TrackCounter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCointerConfig.class)
public class TrackCounterTest {
    /*@Rule
    public final StandardOutputStreamLog log =new StandardOutputStreamLog();*/

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCounter() {
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(4);
        compactDisc.playTrack(4);

        assertEquals(1,trackCounter.getPlayCount(1));
        assertEquals(1,trackCounter.getPlayCount(2));
        assertEquals(4,trackCounter.getPlayCount(3));
        assertEquals(2,trackCounter.getPlayCount(4));

        assertEquals(0,trackCounter.getPlayCount(5));
        assertEquals(0,trackCounter.getPlayCount(6));
        assertEquals(0,trackCounter.getPlayCount(7));
    }
}
