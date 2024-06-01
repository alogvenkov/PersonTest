import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testIsTeenager_12yarsOld() {
        boolean result = Person.isTeenager(12);
        assertFalse(result);
    }

    @Test
    public void testIsTeenager_13yearsOld() {
        boolean result = Person.isTeenager(13);
        assertTrue(result);
    }

    @Test
    public void testIsTeenager_15yearsOld() {
        boolean result = Person.isTeenager(15);
        assertTrue(result);
    }

    @Test
    public void testIsTeenager_19yearsOld() {
        boolean result = Person.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void testIsTeenager_20yearsOld() {
        boolean result = Person.isTeenager(20);
        assertFalse(result);
    }

    @Test
    public void testIsTeenager_0yearsOld() {
        boolean result = Person.isTeenager(0);
        assertFalse(result);
    }

}
