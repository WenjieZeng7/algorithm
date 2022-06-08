package lc100.回溯;

import org.junit.Test;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/burst-balloons/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-07 15:51
 */
//超时了，因为有太多的for循环语句
public class Hot312_戳气球_回溯 {
    List<Integer> result = new ArrayList<>();  //这个可以直接改为int max
    LinkedList<Integer> path = new LinkedList<>();

    @Test
    public void maxCoins(){
        int[] nums = {3,1,5,8};
        boolean[] used = new boolean[nums.length];
        int sum = 0;
        backtraking(nums,used,sum);
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2 - o1;
            }
        });
        for (Integer i:result
             ) {
            System.out.println(i);
        }
        int out = result.get(0);
        System.out.println(out);

    }

    public void backtraking(int[] nums,boolean[] used,int sum){
        if(path.size() == nums.length){ //每次满足的时候，和当前的max比较。这样更简化
            result.add(sum);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true){
                continue;
            }
            int temp = 0;
            if(i == 0 && nums.length == 1){
                temp = nums[0];
            }else if(i == 0){
                for (int j = 1; j < nums.length; j++) {
                    if(used[j] == false){
                        temp = nums[i]* nums[j];
                        break;
                    }
                    if(j == nums.length-1){
                        temp = nums[i];
                    }
                }
            }else if(i == nums.length-1){
                for (int j = nums.length-2; j >=0 ; j--) {
                    if(used[j] == false){
                        temp = nums[i]*nums[j];
                        break;
                    }
                    if(j == 0){
                        temp = nums[i];
                    }
                }
            }else{
                for (int j = i+1; j < nums.length; j++) {
                    if(used[j] == false){
                        temp = nums[i]* nums[j];
                        break;
                    }
                    if(j==nums.length -1){
                        temp = nums[i];
                    }
                }
                for (int j = i-1; j >=0 ; j--) {
                    if(used[j] == false){
                        temp = temp* nums[j];
                        break;
                    }
                }
            }
            used[i] = true;
            path.add(temp);
            sum += temp;
            backtraking(nums,used,sum);
            sum -= temp;
            path.removeLast();
            used[i] = false;
        }
    }
}
