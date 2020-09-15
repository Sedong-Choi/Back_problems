package com.company.test.success;

import java.util.ArrayList;
import java.util.List;

public class Pro_Rank_0915_02 {
    //Between Two Sets

    public static int Solution(int[] a,int[] b){
        int gcdInt = gcd(b); //최대 공약수
        int lcmInt = lcm(a); //최소 공배수

        int count = 0;//리턴을 위한 카운트
        int index = 1;
        int comp = 0;

        while (comp < gcdInt) {
            comp = lcmInt * index;//최소공배수에 index 를 계속 곱해서 약수인지 확인하기 위하여

            if (gcdInt % comp == 0) {
                count ++;
            }

            index++;
        }

        return count;
    }

    private static int gcd(int a, int b) {
        while (b > 0){
            int temp = b;
            b = a % b; // % is remainder
            a = temp;
        }

        return a;
    }

    private static int gcd(int[] input){
        int result = input[0];

        for(int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }

        return result;
    }

    private static int lcm(int a, int b){
        return a * (b / gcd(a, b));
    }

    private static int lcm(int[] input){
        int result = input[0];

        for(int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }

        return result;
    }


}
