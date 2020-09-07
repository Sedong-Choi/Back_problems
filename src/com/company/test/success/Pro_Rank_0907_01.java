package com.company.test.success;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pro_Rank_0907_01 {
    //Diagonal Difference
    //arr_0.add(0,11), arr_0.add(1,2), arr_0.add(2,4)
    // arr.add(0,arr_0)
    //arr_1.add(0,4), arr_1.add(1,5), arr_1.add(2,6)
    // arr.add(0,arr_0)
    //arr_2.add(0,10), arr_2.add(1,8), arr_2.add(2,-12)
    // arr.add(0,arr_0), arr.add(1,arr_1) , arr.add(2,arr_2)


    public int solution(List<List<Integer>> arr){

        int right_sum=0;
        int left_sum=0;

        //right_sum;

            for(int j =0;j<arr.size(); j++){
                    right_sum += arr.get(j).get(j);
            }

        //left_sum;
          int i =0;
            for(int j = arr.size()-1 ; j>-1;j-- ){
                left_sum+=arr.get(i).get(j);
                i++;
            }


        int diff = right_sum - left_sum;

            //Math.abs 사용안하고 다음 코드 사용
        if(diff<0){
            diff=(-1)*diff;
        }

        System.out.println(diff);

        return diff;
    }


}
