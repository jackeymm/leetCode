package com.jackeymm;

/**
 * Created by jackeymm on 2018/7/27.
 */
public class Q7Reverse {

    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0){
            if (x == -2147483648){
                x = 0;
            } else{
                x = 0 - x;
                isNegative = true;
            }
        }
        Integer xx = x;
        StringBuffer strXX = new StringBuffer();
        for (int i = xx.toString().length(); i > 0; i--){
            strXX.append(xx.toString().substring(i - 1 , i));
        }
        if (isNegative){
            strXX = new StringBuffer("-" + strXX.toString());
        }
        if (new Long(strXX.toString()) > 2147483647 || new Long(strXX.toString())< - 2147483648){
            return 0;
        }
        return new Integer(strXX.toString());
    }

    public static int reverseLeetCode(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args){
        int testInt = -2147483641;
        System.out.println(reverse(testInt));
        System.out.println(reverseLeetCode(testInt));
    }
}
