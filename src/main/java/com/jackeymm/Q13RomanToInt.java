package com.jackeymm;

/**
 * Created by jackeymm on 2018/8/9.
 */
public class Q13RomanToInt {

    public static void main(String[] args){
        System.out.println("result : "+ romanToInt("MDCLXII"));//1662
    }

//    强哥答案:
    public static int romanToInt(String s) {
        int ret = 0;
        for (int i= 0; i < s.length();){
            if (i + 1 >= s.length()){
                System.out.println(">"+ s.substring(i, i + 1));
                ret += toInt(s.substring(i, i + 1));
                i += 1;
            } else {
                int numRom = toInt(s.substring(i, i + 2));
                if (numRom != 0) {
                    System.out.println("=="+ s.substring(i, i + 2));
                    ret += numRom;
                    i += 2;
                } else{
                    System.out.println("&"+ s.substring(i, i + 1));
                    ret += toInt(s.substring(i, i + 1));
                    i += 1;
                }
            }
        }
        return ret;
    }

    private static  int toInt(String str){
        switch (str){
            case "I":return 1;
            case "V":return 5;
            case "X":return 10;
            case "L":return 50;
            case "C":return 100;
            case "D":return 500;
            case "M":return 1000;
            case "IV":return 4;
            case "IX":return 9;
            case "XL":return 40;
            case "XC":return 90;
            case "CD":return 400;
            case "CM":return 900;
            default:
                return 0;
        }
    }


//    public static int Roman2Int(String s){
//        int result = 0;
//
//        for (int i = 0; i < s.length(); i++){
//            String strSingleRom = s.substring(i,i + 1);
//            String strPreRom = "";
//            if (i > 0){
//                strPreRom = s.substring(i - 1, i);
//            }
//            if (strSingleRom.equals(enumRom.ROM_I.code)){
//                result += enumRom.ROM_I.value;
//            }
//            if (strSingleRom.equals(enumRom.ROM_V.code)){
//                result += enumRom.ROM_V.value;
//                if (i > 0 && strPreRom.equals(enumRom.ROM_I.code)){
//                    result = result - (enumRom.ROM_I.value * 2);
//                }
//            }
//            if (strSingleRom.equals(enumRom.ROM_X.code)){
//                result += enumRom.ROM_X.value;
//                if (i > 0 && strPreRom.equals(enumRom.ROM_I.code)){
//                    result = result - (enumRom.ROM_I.value * 2);
//                }
//            }
//            if (strSingleRom.equals(enumRom.ROM_L.code)){
//                result += enumRom.ROM_L.value;
//                if (i > 0 && strPreRom.equals(enumRom.ROM_X.code)){
//                    result = result - (enumRom.ROM_X.value * 2);
//                }
//            }
//            if (strSingleRom.equals(enumRom.ROM_C.code)){
//                result += enumRom.ROM_C.value;
//                if (i > 0 && strPreRom.equals(enumRom.ROM_X.code)){
//                    result = result - (enumRom.ROM_X.value * 2);
//                }
//            }
//            if (strSingleRom.equals(enumRom.ROM_D.code)){
//                result += enumRom.ROM_D.value;
//                if (i > 0 && strPreRom.equals(enumRom.ROM_C.code)){
//                    result = result - (enumRom.ROM_C.value * 2);
//                }
//            }
//            if (strSingleRom.equals(enumRom.ROM_M.code)){
//                result += enumRom.ROM_M.value;
//                if (i > 0 && strPreRom.equals(enumRom.ROM_C.code)){
//                    result = result - (enumRom.ROM_C.value * 2);
//                }
//            }
//
//        }
//        return result;
//    }
//
//    enum enumRom{
//        ROM_I("I",1),
//        ROM_V("V",5),
//        ROM_X("X",10),
//        ROM_L("L",50),
//        ROM_C("C",100),
//        ROM_D("D",500),
//        ROM_M("M",1000);
//
//
//        private String code;
//        private int value;
//
//        enumRom(String code, int value){
//            this.code = code;
//            this.value = value;
//        }
//    }
}
