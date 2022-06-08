package lc100.数学;

import org.junit.Test;

/**
 *https://leetcode-cn.com/problems/hamming-distance/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-06 17:17
 */
public class Hot461_汉明距离_数学异或 {
    @Test
    public void distance(){
        int x = 1,y = 4;
        int temp = x^y;
        System.out.println(Integer.bitCount(temp)); //内置的计算二进制表达中 1 的数量的函数。
    }


    //异或移位操作
    @Test
    public void distance2(){
        int x = 1,y = 4;
        int temp = x^y;
        int out = 0;
        while(temp != 0){
            out += temp & 1;
            temp >>= 1;
        }
        System.out.println(out);
    }
}
