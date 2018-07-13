import com.cathy.leetcode._2_MaxProfit;
import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTests {
    @Test
    public void test1(){
        int[] input={7,1,5,3,6,4};
        int result=_2_MaxProfit.maxProfit(input);
        Assert.assertEquals(7,result);
    }

    @Test
    public void test2(){
        int[] input={1,2,3,4,5};
        int result=_2_MaxProfit.maxProfit(input);
        Assert.assertEquals(4,result);
    }

    @Test
    public void test3(){
        int[] input={7,6,4,3,1};
        int result=_2_MaxProfit.maxProfit(input);
        Assert.assertEquals(0,result);
    }
}
