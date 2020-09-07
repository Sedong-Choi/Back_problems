package com.company.test.success;

import java.util.List;

public class Pro_Rank_0907_02 {
    //Mini-Max Sum


    public void solution(int[] arr){
        long[] sum = new long[arr.length];
        for(int i=0; i<arr.length;i++){
            for(int j =0 ; j<arr.length;j++){
                if(i!=j){
                    sum[i]+=arr[j];
                }
            }
        }

        long min = sum[0];
        long max = sum[0];
        for(int i =1; i<arr.length;i++){
            if(min>sum[i]){
                min=sum[i];
            }
            if(max<sum[i]){
                max=sum[i];
            }
        }

        System.out.println(min + " "+max);

    }


}
