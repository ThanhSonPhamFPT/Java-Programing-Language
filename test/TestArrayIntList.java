import com.arthur.ArrayIntList;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestArrayIntList {
    @Test
    public void TestAddGet1(){
        ArrayIntList list = new ArrayIntList();
        list.add(42);
        list.add(-3);
        list.add(15);
        assertEquals(42, list.get(0));
        assertEquals(-3, list.get(1));
        assertEquals(15, list.get(2));
    }
    @Test
    public void TestIsEmpty(){
        ArrayIntList list = new ArrayIntList();
        assertTrue(list.isEmpty());
        list.add(123);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());

    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testBadIndex() {
        ArrayIntList list = new ArrayIntList();
     //   list.add(3);
        list.get(0);   // should fail
    }




}
