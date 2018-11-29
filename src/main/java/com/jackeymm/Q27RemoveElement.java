package com.jackeymm;

/**
 * Created by jackeymm on 2018/8/10.
 */
public class Q27RemoveElement {

    public static void main(String[] args){
        System.out.print("result : " + removeElement(new int[]{1, 2, 3}, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[i - index] = nums[i];
            } else{
                index++;
            }
        }
        return nums.length - index;
    }
}
