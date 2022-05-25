package lc100;

import org.junit.Test;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.Arrays;

/**
 * https://leetcode.cn/problems/target-sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-13 17:47
 * 0 <= nums[i] <= 1000，都是正数
 * 对于现在显示的示例，因为回溯就是for，超出时间限制。
 */
public class Hot494_目标和_回溯_超时 {
    int result;

    @Test
    public void findTargetSumWays(){
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int target = 1;
        int[] nums2 = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) { //与相反数拼接
            nums2[i] = nums[i];
            nums2[i+nums.length] = -nums[i];
        }
        boolean[] used = new boolean[nums.length];
        backtrack(nums2,target,0,0,0,nums.length,used);
        System.out.println(result);

    }

    private void backtrack(int[] nums2,int target,int sum,int startIndex,int times,int length,boolean[] used){
        //1.返回值和参数，参数times代表已经有多少个数字进入到计算了，length代表nums.length, used[]表示是否用过
        //2.终止条件
        if(times == length){
            if(sum == target){
                result ++;
            }
            return;
        }

        //3.单层逻辑
        for (int i = startIndex; i < 2*length; i++) {
            if(2*length - i < length - times){ //剪枝，个数不足
                break;
            }
            if(used[i%length] == false){
                times++;
                sum += nums2[i];
                used[i%length] = true;
                backtrack(nums2,target,sum,i+1,times,length,used);
                used[i%length] = false;
                sum -= nums2[i];
                times--;
            }
        }
    }

    @Test
    public void test(){
        System.out.println(Math.pow(2,19));
    }

}
