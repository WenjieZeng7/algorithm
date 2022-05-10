package sorting;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-24 20:16
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] num = {6,1,2,7,9,3,4,5,10,8};
        quickSortMethod(num,0,num.length-1);
        System.out.println(arrayToString(num));
    }

    public static void quickSortMethod(int[] num,int left,int right){
        //如果left等于right，即数组只有一个元素，直接返回
        if(left>=right) {
            return;
        }

        //做一开始的状态保存，为递归服务
        int left0 = left;
        int right0 = right;

        //设置最左边的元素为基准值
        int pivot=num[left];

        //直到2个指针指向同一个元素
        while(left < right){
            //1.从右边开始找比pivot小的数
            while (num[right]>=pivot && left<right){
                right --;
            }
            num[left] = num[right];
            //2.从左边开始找比pivot大的数
            while(num[left]<=pivot && left<right){
                left ++;
            }
            num[right] = num[left];
        }
        num[left] = pivot;  //最后的分界，把pivot填入

        //递归
        quickSortMethod(num,left0,left-1);
        quickSortMethod(num,right+1,right0);
    }

    private static String arrayToString(int[] arr){
        String str = "";
        for(int a : arr){
            str += a + "\t";
        }
        return str;
    }


}
