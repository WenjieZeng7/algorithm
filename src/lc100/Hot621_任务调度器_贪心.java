package lc100;

import jdk.nashorn.internal.ir.ReturnNode;
import org.junit.Test;

import javax.swing.*;
import java.util.*;

/**
 * https://leetcode.cn/problems/task-scheduler/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-09 14:24
 * 之前用了模拟，但是没有考虑到AAAABC，而n=1的类似情况：A->B->A->C->冷却->A... 而不是 A->B->C->A->冷却->A
 * 而且模拟好复杂啊。。但是思想和贪心这个差不多。。
 * 算法高手们是真的牛
 * 参考题解：https://leetcode.cn/problems/task-scheduler/solution/jian-ming-yi-dong-de-javajie-da-by-lan-s-jfl9/
 * 这里的题解的图为什么正确的，为什么一定可以在maxTimes轮结束（maxTimes=出现元素最多的次数）
 *      结合每轮是否有冷却来理解。
 *          没有冷却的话，就是task.length。
 *          有冷却的话，不在maxTimes轮的元素，就应该补到冷却里。
 */
public class Hot621_任务调度器_贪心 {
    @Test
    public void leastInterval() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int[] buckets = new int[26];  //数组哈希表，buckets[0]为A
        for(int i = 0; i < tasks.length; i++){
            buckets[tasks[i] - 'A']++;
        }
        Arrays.sort(buckets);  //从小到大排序
        int maxTimes = buckets[25];
        int maxCount = 1;
        for(int i = 25; i >= 1; i--){
            if(buckets[i] == buckets[i - 1])
                maxCount++; //这个就是最后一轮时用多少个任务
            else
                break;
        }
        int res = (maxTimes - 1) * (n + 1) + maxCount;
        //没有冷却时间，这种情况时再用上述公式计算会得到一个不正确且偏小的结果。所以取两者的大值。
        System.out.println( Math.max(res, tasks.length));
    }
}
