package com.company.test.success;

import java.util.ArrayList;
import java.util.List;

public class Pro_Rank_0923_01 {
    //Exceptions - String to Integer

    public static int solution(String s){
        int result=0;
        try{
            System.out.println(Integer.parseInt(s));
        }catch (Exception e){
            System.out.println("Bad String");
        }
        return result;
    }

}
