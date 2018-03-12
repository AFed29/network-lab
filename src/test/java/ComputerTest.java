import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer computer;

    @Before
    public void before() {
        computer = new Computer("Keith's Desktop", "Apple", "Macbook Pro");
    }

    @Test
    public void hasName(){
        assertEquals("Keith's Desktop", computer.getName());
    }

    @Test
    public void hasMake(){
        assertEquals("Apple", computer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Macbook Pro", computer.getModel());
    }

    @Test
    public void canConnect() {
        assertEquals("Connecting to network: CodeClan", computer.connect("CodeClan"));
    }

}
