package com.jackeymm;

/**
 * Created by jackeymm on 2018/7/12.
 */
public class Q1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for( int i = 0; i < nums.length; i++){
            for(int j =i+1; j < nums.length; j++){
                if(nums[i] == target - nums[j]){
                   return new int[] {i , j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int[] test =  new int []{2,5,5,11};
        twoSum(test, 10);
    }
}
