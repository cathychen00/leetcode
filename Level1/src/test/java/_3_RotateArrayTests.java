import com.cathy.leetcode._3_RotateArray;
import org.junit.Test;

import java.util.Arrays;

public class _3_RotateArrayTests {
    @Test
    public void test1(){
        int[] arr= {1,2,3,4,5,6,7};
        _3_RotateArray.rotate(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}
