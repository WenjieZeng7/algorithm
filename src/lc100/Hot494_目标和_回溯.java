package lc100;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/target-sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-13 17:47
 * 0 <= nums[i] <= 1000，都是正数
 * 回溯在选择个数和总个数**一致**情况下的写法，没有单层for，直接一直往下即可。
 */
public class Hot494_目标和_回溯 {
    int result;

    @Test
    public void findTargetSumWays(){
        int[] nums = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int target = 1;
        backtrack(nums,target,0,0);
        System.out.println(result);

    }

    private void backtrack(int[] nums,int target,int startIndex,int sum){ //1.返回值和参数
        //2.终止条件。因为就是从左到右，一定会结束，
        if(startIndex == nums.length){
            if(sum == target){
                result ++;
            }
            return;
        }else {
            //这种写法：sum+nums[]，就包含了之前传统在backtrack()前sum+，之后sum-。
            backtrack(nums,target,startIndex+1,sum+nums[startIndex]);
            backtrack(nums,target,startIndex+1,sum-nums[startIndex]);

            // backtrack(nums,target,startIndex+1,sum+nums[startIndex]);其实就相当于:
//            sum += nums[startIndex];
//            backtrack(nums,target,startIndex+1,sum);
//            sum -= nums[startIndex];
        }
    }
}
/**
 * 执行用时：526 ms, 在所有 Java 提交中击败了22.31% 的用户
 * 内存消耗：39.2 MB, 在所有 Java 提交中击败了60.16% 的用户
 * 时间复杂度O(2^n)
 */
