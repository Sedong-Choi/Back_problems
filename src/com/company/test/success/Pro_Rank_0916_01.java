package com.company.test.success;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pro_Rank_0916_01 {
    //Manasa and Stones

    public static int[] stones(int n, int a, int b) {
        int[] result ;
        List<Integer> first = new ArrayList<Integer>();
        //결과 값만 같으면 되기 때문에 더하는 순서는 상관없다.
        //n번의 더하기를 해야하고
        //a더한 횟수 b더한 횟수 = n 이어야 한다.

        if(a==b){
            result = new int[1];
            result[0]= a*(n-1);

        }else{
            result = new int[n];
            if(b<a){
                int temp = b;
                b=a;
                a=temp;
            }
            for(int i =0; i<n ;i++){
                result[i]= a*(n-1-i)+b*i;
            }
        }

        for(int i =0; i< result.length;i++){
            System.out.println(result[i]);
        }

        return result;
    }

}
