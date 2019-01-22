package com.jackeymm;

public class Q66PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        plusOne(digits);
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >=0 ; i--){
            if(digits[i] + 1 < 10){
                digits[i] = digits[i] + 1;
                break;
            }else if(i == 0){
                return plusOneRise(digits);
            }else {
                digits[i] = 0;
            }
        }
        return digits;
    }

    private static int[] plusOneRise(int[] digits){
        int[] resultList = new int[digits.length + 1];
        for(int i = 0; i < resultList.length; i++){
           if(i == 0){
               resultList[i] = 1;
           }else{
               resultList[i] = 0;
           }
        }
        return resultList;
    }
}
