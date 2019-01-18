package com.jackeymm;

public class Q53MaxSubArray {
    public static void main(String[] args) {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {1};
        int[] nums = {-1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        for(int i = nums.length -1 ; i >= 0 ; i--){
            int tempInt = 0;
            for(int j = i; j < nums.length; j++){
                tempInt += nums[j];
                if(result < tempInt){
                    result = tempInt;
                }
            }
        }
        return result;
    }
}
