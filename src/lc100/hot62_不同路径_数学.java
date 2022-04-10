package lc100;

import com.sun.org.apache.xalan.internal.xsltc.dom.SortingIterator;
import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/unique-paths/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 21:06
 * 注意数字会太大，不应该去算每个的阶乘值。
 * 自动类型转换，计算时全部都先转为容量大的数据类型。
 */
public class hot62_不同路径_数学 {
    int result = 0;
    @Test
    public void pathNum(){
        int m = 10;
        int n = 10;
        //在总共m+n-2中，选m-1个空
        long out = 1;
        for (int x = n,y = 1; y < m; x++,y++) {
            out = out*x/y; //必须这么写，而不是写成out *= x/y,这样等式右边在计算时，没有进行自动类型转换。
        }
        System.out.println(out);
    }

}
