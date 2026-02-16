import static org.junit.Assert.*;
import org.junit.Test;

public class PantryTest {
    @Test
    public void testRestock() {
        PantryManager pm = new PantryManager();
        assertTrue("Should allow restocking", pm.restockItem(0, 5));
        assertFalse("Should block overfilling", pm.restockItem(0, 50));
    }

    @Test
    public void testStatus() {
        PantryManager pm = new PantryManager();
        assertEquals("Critical", pm.checkStatus(4)); // Apples are at 0
        assertEquals("Low", pm.checkStatus(0));      // Milk is at 2
    }
}
