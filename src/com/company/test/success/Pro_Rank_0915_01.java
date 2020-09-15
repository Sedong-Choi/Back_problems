package com.company.test.success;

public class Pro_Rank_0915_01 {
    //Kangaroo

    public static String Solution(int x1, int v1, int x2, int v2){
        int a_position=x1;
        int b_position=x2;
        int a_t=0;
        int b_t=0;

        while(a_t<10000){

            a_position = x1 + a_t*v1;
            b_position = x2 + b_t*v2;
            System.out.println("a_position = "+a_position);
            System.out.println("b_position = "+b_position);
            a_t++;
            b_t++;
            if(a_position == b_position){
                break;
            }
        }
        if(a_position == b_position){
            return "YES";
        }else{
            return "NO";
        }

    }


}
