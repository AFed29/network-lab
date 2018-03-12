import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Computer computer;

    @Before
    public void before() {
        network = new Network("CodeClan");
        computer = new Computer("Keith's Desktop", "Apple", "Macbook Pro");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(computer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(computer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }
}
