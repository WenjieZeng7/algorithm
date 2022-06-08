package lc100.回溯;

import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/unique-paths/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-10 21:06
 * 回溯的本质其实也是暴力，在输入大的情况下会超时。
 */
public class Hot62_不同路径_回溯 {
    int result = 0;
    @Test
    public void pathNum(){
        int m = 3;
        int n = 2;
        backtrack(1,1,m,n);
        System.out.println(result);
    }

    public void backtrack(int i, int j,int m,int n) {
        if(i == m && j == n){
            result ++;
            return;
        }

        if(i < m){
            i++;
            backtrack(i,j,m,n);
            i--;
        }

        if(j < n){
            j++;
            backtrack(i,j,m,n);
            j--;
        }
    }
}
