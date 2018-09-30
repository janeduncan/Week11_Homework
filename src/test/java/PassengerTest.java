import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jane Duncan");
    }

    @Test
    public void hasName() {
        assertEquals("Jane Duncan", passenger.getName());
    }

}