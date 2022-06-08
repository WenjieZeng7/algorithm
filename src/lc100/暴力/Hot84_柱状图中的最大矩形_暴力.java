package lc100.暴力;

import org.junit.Test;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/largest-rectangle-in-histogram/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-27 13:46
 * 分成两类：
 *  1.单个柱体
 *  2.以单个柱体的高度为准，往左右扩展，直到高度不同。
 *
 *  超时
 */
public class Hot84_柱状图中的最大矩形_暴力 {
    @Test
    public void largestRectangleArea(){
        int[] heights = {2,1,5,6,2,3};
        int[] temp = new int[heights.length * 2];
        // 第1部分：单个柱体
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        
        // 第2部分：以单个柱体的高度为准，往左右扩展，直到高度不同。
        for (int i = 0; i < heights.length; i++) {
            int tem = 0;
            for (int j = i-1; j >= 0; j--) {
                if(temp[j] >= temp[i]){
                    tem += temp[i];
                }else{
                    break;
                }
            }

            for (int j = i; j < heights.length; j++) {
                if(temp[j] >= temp[i]){
                    tem += temp[i];
                }else{
                    break;
                }
            }
            temp[i+heights.length] = tem;
        }

        Arrays.sort(temp);
        System.out.println(temp[temp.length -1]);
    }

}
