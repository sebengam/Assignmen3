package TPAssignment3.co.za;

import junit.framework.TestCase;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.*;


import static org.hamcrest.CoreMatchers.is;

/**
 * Created by thabomoopa on 2017/03/21.
 */
public class ShoppingItemsTest extends TestCase {

    ShoppingItems items1 = new ShoppingItems("Pizza",87.59, "Bacon and Egg" );
    ShoppingItems items2 = new ShoppingItems("Burger",90.00, "Big Mac" );
    ShoppingItems items3 = new ShoppingItems("Twin savers",39, "Toilet Paper" );
    ShoppingItems items4 = new ShoppingItems("Mortein",67, "Natural Guide " );

    @Test
    public void testArrayList()
    {

        List<ShoppingItems> items = new ArrayList<ShoppingItems>();
        items.add(items2);
        assertTrue("Object is in the List", items.contains(items2));
    }
    @Test
    public void testLinkList()
    {
        List<ShoppingItems> items = new LinkedList<ShoppingItems>();
        items.add(items1);
        items.remove(items1);
        assertFalse("Objects are in the list", items.contains(items1));

    }
    @Test
    public void testVector()
    {
        List<ShoppingItems> items = new Vector<ShoppingItems>();
        items.add(items3);
        items.add(items2);
        items.remove(items2);
        assertNotNull(items);
    }
    @Test
    public void testStack()
    {
        List<ShoppingItems> items = new Stack<ShoppingItems>();
        items.add(items3);
        items.add(items2);
        items.remove(1);
        assertNotSame("Objects are they the same", items2,items3);

    }
    @Test
   public void testHashSet()
    {
        Set<ShoppingItems> items = new HashSet<ShoppingItems>();
        items.add(items1);
        items.add(items2);
        items.add(items1);
        assertSame("Trying to add same object into Hashset", items1,items1);
    }
    @Test
    public void testLinkedHashSet()
    {
        Set<ShoppingItems> items = new LinkedHashSet<ShoppingItems>();
        items.add(items4);
        items.add(items3);
        items.remove(0);
        assertTrue(items.contains(items4));
    }
    @Test
    public void testTreeSet()
    {
        Set<ShoppingItems> items = new TreeSet<ShoppingItems>();
        assertNull(items);
    }
    @Test
    public void testWeakHashMap()
    {
        Map<String, ShoppingItems> items = new WeakHashMap();
        items.put("key1", items1);
        items.put("Key2", items2);
        items.put("key3", items3);

        ShoppingItems newItems = (ShoppingItems) items.get("Key2");
        assertEquals(items2,newItems);
    }

}
