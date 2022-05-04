package lc100;

import com.sun.imageio.plugins.gif.GIFImageReader;
import org.junit.Test;

/**
 * https://leetcode-cn.com/problems/number-of-islands/
 * @author Jesse 1094798816@qq.com
 * @create 2022-04-16 23:53
 */
public class Hot200_岛屿数量_dfs {
    @Test
    public void island(){
        //'1'（陆地）和 '0'（水）
        //可以假设该网格的四条边均被水包围
        //每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成
        char[][] grid = new char[][]{
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'},
        };

        int nr = grid.length;
        int nc = grid[0].length;
        int out = 0;

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if(grid[i][j] == '1'){
                    out++;
                    dfs(grid,i,j,nr,nc);
                }
            }
        }

        System.out.println(out);
    }

    /**
     * 深度优先算法
     * @param grid
     * @param r 第几行，从0开始
     * @param c 第几列，从0开始
     * @param nr 行数
     * @param nc 列数
     */
    private void dfs(char[][] grid, int r, int c,int nr, int nc){
        if(r<0 || c<0 || r >= nr || c >= nc || grid[r][c] == '0'){
            return;
        }

        grid[r][c] = '0';
        //需要向4个方向进行判断，上下左右
        //{'1', '0', '1', '1', '1'}
        //{'1', '0', '1', '0', '1'}
        //{'1', '1', '1', '0', '1'}
        dfs(grid,r-1,c,nr,nc); //上
        dfs(grid,r+1,c,nr,nc); //下
        dfs(grid,r,c-1,nr,nc); //左
        dfs(grid,r,c+1,nr,nc); //右
    }

}
