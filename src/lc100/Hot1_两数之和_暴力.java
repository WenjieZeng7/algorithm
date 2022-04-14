package lc100;

import org.junit.Test;

import java.security.PrivateKey;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/two-sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-05 23:35
 */
public class Hot1_两数之和_暴力 {
    //简单for循环
    @Test
    public void forMethod(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = new int[2];
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1;j<nums.length;j++){
                int temp = nums[i] + nums[j];
                if (temp == target){
                    result[0] = i;
                    result[1] = j;
                    System.out.println(result[0]);
                    System.out.println(result[1]);
                }
            }
        }
    }
}
