package com.company.test.success;

import java.util.Arrays;

public class Pro_Rank_0904_01 {
    //이렇게 만들면 맨 앞자리만 보고 판단하기 때문에 앞의 알팝벳이 같으면 오류가 남

    //반면 compareTo(String) 을 사용하면 이 오류를 해결할 수 있음

    public static String solution(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        /*
        String[] subst_k= new String[s.length()-k+1];
        for(int i = 0; i<s.length()-k+1;i++){
            subst_k[i] = s.substring(i,i+k);

        }
        char[] char_code= new char[subst_k.length];
        for(int i =0; i< subst_k.length;i++){
            char_code[i] = subst_k[i].charAt(0);

        }
        int min =(int) char_code[0];
        int max = (int) char_code[0];
        smallest =subst_k[0];
        largest = subst_k[0];
        char temp;
        for(int i= 0; i<char_code.length;i++){

                if((int)char_code[i]<min){
                        min = (int) char_code[i];
                        smallest = subst_k[i];
                }

                if((int)char_code[i]>max){
                    max =(int) char_code[i];
                    largest = subst_k[i];
                }

        }

        */

        //오류 없이 알파벳 순서대로 정렬하는 법
        smallest = s.substring(0,k);
        for(int i=0;i<s.length()-k+1;i++){
            if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k);
        }




        return smallest + "\n" + largest;
    }

}
