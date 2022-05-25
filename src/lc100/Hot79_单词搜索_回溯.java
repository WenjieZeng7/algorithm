package lc100;

import org.junit.Test;

import javax.swing.text.AbstractDocument;

/**
 * https://leetcode.cn/problems/word-search/
 * @author Jesse 1094798816@qq.com
 * @create 2022-05-12 16:27
 * 边界的处理方式。
 * 而且与之前在backtrack()中用循环的回溯不同
 */
public class Hot79_单词搜索_回溯 {
    boolean flag;
    @Test
    public void exist() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        int nr = board.length;
        int nc = board[0].length;
        boolean[][] used = new boolean[nr][nc];
        lable:for (int i = 0; i < nr; i++) { //每一个起始位置都要进行回溯。
            //也不需要每个循环都建used[][]，因为回溯的特点，每次回溯结束后，used[][]都归为原样。
            for (int j = 0; j < nc; j++) {
                backtrack(board,word,i,j,nr,nc,0,used);
                if(flag == true){
                    System.out.println(true);
                    break lable;
                }
            }
        }
    }

    private void backtrack(char[][] board,String word,int r,int c,int nr,int nc,int nums,boolean[][] used){ //1.参数和返回值，r:行，c:列。
        if(nums == word.length()){ //2.终止条件
            flag = true;
            return;
        }

        //3.单次的判断逻辑
        if(r>= 0 && r<nr && c>= 0 && c < nc &&board[r][c] == word.charAt(nums) && used[r][c] == false){
            nums++;
            used[r][c] = true;
            if(c != 0){
                backtrack(board,word,r,c-1,nr,nc,nums,used); //往左
            }
            if(c != nc){
                backtrack(board,word,r,c+1,nr,nc,nums,used); //往右
            }
            if(r != 0){
                backtrack(board,word,r-1,c,nr,nc,nums,used); //往上
            }
            if(r != nr){
                backtrack(board,word,r+1,c,nr,nc,nums,used); //往下
            }
            used[r][c] = false;
            nums --;
        }
    }
}
