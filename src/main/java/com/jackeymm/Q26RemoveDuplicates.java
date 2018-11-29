package com.jackeymm;

/**
 * Created by jackeymm on 2018/7/30.
 */
public class Q26RemoveDuplicates {

//    标准答案。。
    public static int removeD(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }




//    public static int (int[] nums){
//        int intWhile = 0;
//        do{
//            for (int i = 0; i < nums.length - 1;){
//                if (nums[i] == nums[i + 1]){
//                    nums = displacement(i, nums);
//                }
//                    i++;
//            }
//            intWhile++;
//        } while (intWhile < 1);
//
//        for (int i = 0; i < nums.length - 1; i++){
//            if (nums[i] == nums[i + 1]){
//                return i + 1;
//            }
//        }
//        return nums.length;
//    }
//
//    private static int[] displacement(int index, int[] nums){
//        for (int i = index; i < nums.length - 1; i++){
//            nums[i] = nums[i + 1];
//        }
//        return nums;
//    }




    public static void main(String[] args){
        System.out.println(removeD(new int[]{1}));

        System.out.println("###########");

        System.out.println(removeD(new int[]{1,1,2}));

        System.out.println("###########");

        System.out.println("count : " + removeD(new int[]{0,0,1,1,1,2,2,3,3,4}));

        System.out.println("###########");

        System.out.println("count : " + removeD(new int[]{-3,-1,-1,0,0,0,0,0,2}));
    }
}
