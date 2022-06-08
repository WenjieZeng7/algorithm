package lc100.排序;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.cn/problems/course-schedule/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-26 14:22
 * 第一次做图相关。
 * 拓扑排序：把一个 有向无环图 转成 线性的排序 就叫 拓扑排序。
 *          BFS+贪心，应用于有向图的一个专有名词。
 *          存在环的有向图没有拓扑排序
 * 题解：
 * https://leetcode.cn/problems/course-schedule/solution/bao-mu-shi-ti-jie-shou-ba-shou-da-tong-tuo-bu-pai-/
 * https://leetcode.cn/problems/course-schedule/solution/tuo-bu-pai-xu-by-liweiwei1419/
 * https://leetcode.cn/problems/course-schedule/solution/by-lfool-eiuk/
 *
 * 有向图的一些概念：
 *  入度和出度
 *      如果存在一条有向边 A --> B，则这条边给 A 增加了 1 个出度，给 B 增加了 1 个入度。
 *
 * 需要的数据结构
 *  1.邻接表：记录依赖关系
 *      key：课号
 *      value：这门课的**直接后续**课（多门）
 *  2.入度数组：课号 0 到 n - 1 作为索引，值为该索引课程的入度。
 *  **邻接表不会变，一直在维护入度数组**
 */
public class Hot207_课程表_有向图_拓扑排序 {
    // 自己的思考：有先后顺序，判断有向图是否存在环
    @Test
    public void canFinish(){
        int numCourses = 5;
        int[][] prerequisites = {{1,4},{2,4},{3,1},{3,2}};
        int plen = prerequisites.length;
        if (plen == 0){
            System.out.println(true);
            return;
        }

        int[] inDegree = new int[numCourses];  // 入度数组
        List<Integer>[] graph = buildGraph(prerequisites, numCourses); //邻接表：index（课号）为key，该课直接后续课为value

        // 初始化入度数组
        for (int i = 0; i < prerequisites.length; i++) {
            inDegree[prerequisites[i][0]] ++;
        }

        // 把入度为0的课加入队列中
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0){
                queue.push(i);
            }
        }

        int count = 0; // 加入到队列中的课程数
        // 出队，并修改入度数组
        while (!queue.isEmpty()){
            int course = queue.removeFirst();
            count ++;
            // 获取该course课程的直接后续课程：graph[course] 数组
            for (int i = 0; i < graph[course].size(); i++) {
                inDegree[graph[course].get(i)] --;
                if(inDegree[graph[course].get(i)] == 0){
                    queue.push(graph[course].get(i)); // 入度为0的课程加入队列中。
                }
            }
        }
        System.out.println(count == numCourses);

    }

    /**
     * 邻接矩阵 =》 邻接表
     * @param edges
     * @param n
     * @return
     */
    private List<Integer>[] buildGraph(int[][] edges,int n){
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            int from = edge[1];
            int to = edge[0];
            graph[from].add(to);
        }
        return graph;
    }
}
/**
 * 执行用时：4 ms, 在所有 Java 提交中击败了61.53% 的用户
 * 内存消耗：41.6 MB, 在所有 Java 提交中击败了52.86% 的用户
 */
