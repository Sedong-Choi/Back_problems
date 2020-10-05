package com.company.test.success;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class Pro_0908_01 {
    //프로그래머스 위장


    public void solution(String[][] clothes ){
        int answer = 1;
        Map<String,Integer> body = new HashMap<String,Integer>();

        int c_len = clothes.length;
        for(int i =0; i<c_len ; i++){
            // getOrDefault(Object key, V defaultValue)  Map.java안에 있는 메서드
            body.put(clothes[i][1],body.getOrDefault(clothes[i][1],0)+1);
        }

        for(int val : body.values()){
            answer *=(val+1);
        }


        System.out.println(answer-1);


    }
    public int solution1(String[][] clothes ){
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;


    }




}
