package com.jackeymm;

/**
 * Created by jackeymm on 2018/7/30.
 */
public class Q9IsPalindrome {

    public static boolean isP(int x){

        Integer ix = new Integer(x);
        String strx = ix.toString();
        int length = strx.length();
        if (x < 0){
            return false;
        }
        if (length == 1){
            return true;
        }
        if (length % 2 != 0){
            length = strx.length() - 1;
        }

        for (int i = 0; i < length / 2; i++){
            if (!strx.substring(i,i + 1).equals(strx.substring(strx.length() - i - 1  , strx.length() - i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isP(1001));
    }
}
