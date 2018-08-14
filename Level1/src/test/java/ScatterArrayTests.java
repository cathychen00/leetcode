import com.cathy.leetcode._4_ScatterArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ScatterArrayTests {
    @Test
    public void testNull(){
        Integer[] result= _4_ScatterArray.scatter(null,1);
        Assert.assertNull(result);
    }

    @Test
    public void testShort(){
        Integer[] arr={1,2,2};
        Integer[] result= _4_ScatterArray.scatter(arr,3);
        Assert.assertArrayEquals(arr,result);
    }

    @Test
    public void testStart(){
        Integer[] arr={2,2,2,2,3,4,5};
        Integer[] expect={2,2,2,3,2,4,5};
        Integer[] result= _4_ScatterArray.scatter(arr,3);
        Assert.assertArrayEquals(expect,result);
    }

    @Test
    public void testEnd(){
        Integer[] arr={3,4,5,2,2,2,2};
        Integer[] expect={3,4,2,5,2,2,2};
        Integer[] result= _4_ScatterArray.scatter(arr,3);
        Assert.assertArrayEquals(expect,result);
    }

    @Test
    public void testMiddle(){
        Integer[] arr={3,4,5,2,2,2,2,1,1};
        Integer[] expect={3,4,5,2,2,2,1,2,1};
        Integer[] result= _4_ScatterArray.scatter(arr,3);
        System.out.println(Arrays.toString(result));
        Assert.assertArrayEquals(expect,result);
    }

    @Test
    public void testMultiple(){
        Integer[] arr={3,4,5,2,2,2,2,1,1,3,3,3,3,2,2,2,2,1};
        Integer[] expect={3,4,5,2,2,2,1,2,1,3,3,3,2,3,2,2,2,1};
        Integer[] result= _4_ScatterArray.scatter(arr,3);
        System.out.println(Arrays.toString(result));
        Assert.assertArrayEquals(expect,result);
    }
}
