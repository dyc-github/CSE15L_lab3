import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LinkedListTests {
    @Test
    public void testLinkedList(){
        LinkedList ll = new LinkedList();
        assertEquals(null, ll.first());
    }
    @Test
    public void testPrepend(){
        LinkedList ll = new LinkedList();
        ll.prepend(0);
        assertEquals(0, ll.first());
        ll.prepend(1);
        assertEquals(1, ll.first());
        assertEquals(0, ll.last());
        ll.prepend(2);
        assertEquals("2 1 0 ", ll.toString());
    }
    @Test
    public void testAppend(){
        LinkedList ll = new LinkedList();
        ll.append(0);
        assertEquals(0, ll.last());
        ll.append(1);
        assertEquals(1, ll.last());
        assertEquals(0, ll.first());
        ll.append(2);
        assertEquals(2, ll.last());
    }
    @Test
    public void testFirst(){
        LinkedList ll = new LinkedList();
        ll.append(0);
        assertEquals(0, ll.first());
        ll.append(1);
        assertEquals(0, ll.first());
    }
    @Test
    public void testLast(){
        LinkedList ll = new LinkedList();
        ll.append(0);
        assertEquals(0, ll.last());
        ll.append(1);
        assertEquals(1, ll.last());
    }
    @Test
    public void testToString(){
        LinkedList ll = new LinkedList();
        ll.append(0);
        ll.append(1);
        ll.append(2);
        assertEquals("0 1 2 ", ll.toString());
    }
    @Test
    public void testLength(){
        LinkedList ll = new LinkedList();
        ll.append(0);
        ll.append(1);
        ll.append(2);
        assertEquals(3, ll.length());
        ll.append(3);
        assertEquals(4, ll.length());

    }


}
