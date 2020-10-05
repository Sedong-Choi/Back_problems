package com.company.test.success;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Pro_0929_01 {
    //프로그래머스 주식가격  스택/큐


    public int[] solution(int[] prices){
        int[] answer =new int[prices.length];
        int count;

        for(int i =0; i<prices.length;i++){
            count=0;
            for(int  j =i+1;j<prices.length;j++ ){
                if(prices[i]<=prices[j]){
                    count++;
                }
            }
            answer[i]=count;
        }
        return answer;


    }



}
