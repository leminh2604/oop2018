package week3;
import org.junit.Test;
import static org.junit.Assert.*;
public class Week3Test {
    @Test
 public void testmax()
     // TODO: Viết 5 testcase cho phương thức max()
 {
     assertEquals(9,Week3.max(2,9));
     assertEquals(4,Week3.max(1,4));
     assertEquals(99,Week3.max(99,26));
     assertEquals(10011000,Week3.max(0,10011000));
     assertEquals(1000,Week3.max(1000,999));
 }
    
   @Test
    public void testminarray()
        // TODO: Viết 5 testcase cho phương thức minOfArray()
    {
        int a[]={3,75,1,67,2,14,77,4,5};
        int b[]={5};
        int c[]={1,3,26,5,64,6,342,65,345,4};
        int d[]={100000000,99,764512};
        int e[]={17,85,12345678,123456789,9994484};
        assertEquals(1,Week3.minOfArray(a));
        assertEquals(5,Week3.minOfArray(b));
        assertEquals(1,Week3.minOfArray(c));
        assertEquals(99,Week3.minOfArray(d));
        assertEquals(17,Week3.minOfArray(e));
    }
    
@Test
    public void testBMI()
        // TODO: Viết 5 testcase cho phương thức calculateBMI()
    {
        assertEquals("Thiếu cân",Week3.calculateBMI(52,1.8));
        assertEquals("Bình thường",Week3.calculateBMI(62,1.7));
        assertEquals("Thừa cân",Week3.calculateBMI(70,1.6));
        assertEquals("Béo phì",Week3.calculateBMI(90,1.6));
        assertEquals("Thiếu cân",Week3.calculateBMI(44,1.7));
    }
    
}
