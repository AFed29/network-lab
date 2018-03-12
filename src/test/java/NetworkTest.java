import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Computer computer;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan", 10);
        computer = new Computer("Keith's Desktop", "Apple", "Macbook Pro");
        internetRadio = new InternetRadio();
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
    public void canConnectInternetRadio() {
        network.connect(internetRadio);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(computer);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }


    @Test
    public void hasCapcity(){
        assertEquals(10, network.getCapacity());
    }

    @Test
    public void canGetFreeSlots(){
        network.connect(computer);
        network.connect(internetRadio);
        assertEquals(8,network.freeSlots());
    }

    @Test
    public void cannotConnectIfNoFreeSlots (){
        for (int i = 0; i < 15 ; i++) {
            network.connect(computer);
        }
        assertEquals(10, network.deviceCount());
    }
}
