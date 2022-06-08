package lc100.排序;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.cn/problems/merge-intervals/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-06 15:16
 */
public class Hot56_合并区间_多数组排序_list转二维数组 {
    @Test
    public void merge(){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        // 按左边为准进行排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> res = new ArrayList<>();  // 放对象
        int left = intervals[0][0], right = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][1]<= right){
                continue;
            }else {
                if(intervals[i][0] <= right){
                    right = intervals[i][1];
                }else{
                    res.add(new int[]{left,right});
                    left = intervals[i][0];
                    right = intervals[i][1];
                }
            }
        }
        res.add(new int[]{left,right});
        int[][] out = res.toArray(new int[res.size()][]);  // List<int[]> --》 int[][]


        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(out[i][j]);
            }
        }
    }

    /**
     * 执行用时：6 ms, 在所有 Java 提交中击败了98.03% 的用户
     内存消耗：46.3 MB, 在所有 Java 提交中击败了45.81% 的用户
     */




    @Test
    public void listTo(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int[] out = list.stream().mapToInt(Integer::valueOf).toArray();
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }
}
