package com.leetcode;

<<<<<<< HEAD
import com.leetcode.util.ArrayUtil;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-20 18:07
 */
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int tempMax = 1;
        int tempMin = 1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
=======
/**
 * @author lin
 * @date 2023/12/20 22:58
 **/
public class MaxProduct_152 {

    public int maxProduct(int[] nums) {
        if(nums ==null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int tempMin = 1;
        int tempMax = 1;
        for(int i = 0 ; i < nums.length ; i++) {
>>>>>>> 7fc9a9933b627a6fa7e892470fdd4427d9107c0b
            if(nums[i] < 0) {
                int temp = tempMax;
                tempMax = tempMin;
                tempMin = temp;
            }
<<<<<<< HEAD
            tempMax = Math.max(tempMax,tempMax*nums[i]);
            tempMin = Math.min(tempMin,tempMin*nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int res = new MaxProduct_152().maxProduct(nums);
    }
}
=======
            tempMax = Math.max(nums[i],nums[i] * tempMax);
            tempMin = Math.min(nums[i],nums[i] * tempMin);
            max = Math.max(tempMax,max);
        }
        return max;
    }
}
>>>>>>> 7fc9a9933b627a6fa7e892470fdd4427d9107c0b
