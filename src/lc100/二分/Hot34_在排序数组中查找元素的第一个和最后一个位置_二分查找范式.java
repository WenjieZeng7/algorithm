package lc100.二分;

import org.junit.Test;

/**
 * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @author Jesse 1094798816@qq.com
 * @create 2022-06-13 14:26
 * 必须用时间复杂度为 O(log n) 的算法
 * nums[]为非递减数组
 *
 * 第一个元素:找第一个>=target的下标
 * 第二个元素:找第一个>target的下标
 *
 * 二分查找讲解：
 * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/solution/yi-wen-dai-ni-gao-ding-er-fen-cha-zhao-j-ymwl/
 *
 */
public class Hot34_在排序数组中查找元素的第一个和最后一个位置_二分查找范式 {
    @Test
    public void searchRange(){
        int[] nums = {1};
        int target = 1;
        if(nums.length == 0){
            System.out.println(new int[]{-1,-1});
        }
        int left = binarySearch2(nums,target); //二分查找第一个>=target的index，左边界
        int right = binarySearch3(nums,target); // 二分查找第一个<=target的index，右边界
        System.out.println(left);
        System.out.println(right);
        // 加入不和题意的判断
        if(left <= right && right < nums.length && nums[left] == target && nums[right] == target){
            System.out.println(new int[]{left,right});
        }else{
            System.out.println(new int[]{-1,-1});
        }

    }


    /**
     * 二分查找的范式！！！
     * @param nums
     * @param target
     * @return
     */
    private int binarySearch(int[] nums,int target){
        int left = 0,right = nums.length -1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;  // 没找到
    }


    /**
     * 这种变形，都先写>和<，再根据情况考虑=是放在>还是<处
     * 对于return，全部是返回没有=的情况，如这里left是在没有=的情况
     * 二分查找第一个>=target的index，左边界
     * @param nums
     * @param target
     * @return
     */
    private int binarySearch2(int[] nums,int target){
        int left = 0,right = nums.length -1;
        int mid = 0;
        while (left <= right){
            mid = left + (right-left)/2;
            if(nums[mid] >= target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }


    /**
     * 二分查找第一个<=target的index，右边界
     * @param nums
     * @param target
     * @return
     */
    private int binarySearch3(int[] nums,int target){
        int left = 0,right = nums.length -1;
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;
            if (nums[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
}
/*
执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
内存消耗：45 MB, 在所有 Java 提交中击败了5.17% 的用户
 */
