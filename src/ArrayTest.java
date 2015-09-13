import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;



public class ArrayTest extends junit.framework.TestCase {

    final int SEED = 1;
    final int ARRAY_SIZE = 10000000;

    @org.junit.Test
    public void testSortArray() throws Exception {
        Array MyArray= new Array(ARRAY_SIZE,SEED);
        //сортируем массив и замеряем время работы
        long startTime = System.nanoTime();
        MyArray.SortArray();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Execution time(ms) " + (estimatedTime/ 1000000));

        // проверяем правильность сортировки
        int  previousValue = Integer.MIN_VALUE;
        for (int i = 0; i < MyArray.Size() ; i++) {
            assertTrue("Element " + MyArray.getElement(i) + " at " + i + " position is not in the order", MyArray.getElement(i) >= previousValue);
            previousValue = MyArray.getElement(i);
        }


    }
}