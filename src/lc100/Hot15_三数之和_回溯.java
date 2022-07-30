package lc100;

import com.sun.org.apache.regexp.internal.REUtil;
import com.sun.xml.internal.bind.v2.model.core.Ref;
import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.*;

/**
 * https://leetcode.cn/problems/3sum/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-10 20:51
 * 超时
 */
public class Hot15_三数之和_回溯 {
    Set<List<Integer>> temp = new HashSet<>();
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    @Test
    public void threeSum(){
        int[] nums = {0,0,0,0,0};
        Arrays.sort(nums); // 从小到大排序
        backtracking(nums,0,0);

        // 还要对结果进行去重，借助set
        for (List<Integer> list: temp) {
            result.add(list);
        }

        for (List<Integer> list :result) {
            for (int i : list) {
                System.out.print(i+"    ");
            }
            System.out.println();
        }
    }



    private void backtracking(int[] nums,int startIndex,int sum){
        if(path.size() == 3){
            if(sum == 0){
                temp.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            sum += nums[i];
            path.add(nums[i]);
            backtracking(nums,i+1,sum);
            path.removeLast();
            sum -= nums[i];
        }
    }


}
