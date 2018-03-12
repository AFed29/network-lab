import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioTest {
    InternetRadio internetRadio;

    @Before
    public void before() {
        internetRadio = new InternetRadio();
    }

    @Test
    public void canConnect() {
        assertEquals("Connecting to: CodeClan", internetRadio.connect("CodeClan"));
    }

    @Test
    public void canTuneStation() {
        assertEquals("Tuned to: Forth One", internetRadio.tune("Forth One"));
    }
}
