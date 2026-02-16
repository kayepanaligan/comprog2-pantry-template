import org.junit.Test;
import static org.junit.Assert.*;

public class PantryTest {
    @Test
    public void testRestockLogic() {
        PantryManager pm = new PantryManager();
        // Test 1: Restocking within limits
        assertTrue("Restock should return true for small amounts", pm.restockItem(0, 5));
        
        // Test 2: Overfilling (Initial 2 + 50 > 20)
        assertFalse("Restock should return false if total > 20", pm.restockItem(0, 50));
    }

    @Test
    public void testStatusLogic() {
        PantryManager pm = new PantryManager();
        // index 4 is 'Apples' (Initial 0)
        assertEquals("Critical", pm.checkStatus(4));
        
        // index 1 is 'Eggs' (Initial 12)
        assertEquals("OK", pm.checkStatus(1));
    }
}
