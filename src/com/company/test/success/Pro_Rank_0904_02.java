package com.company.test.success;

public class Pro_Rank_0904_02 {
    //좌우 대칭 단어 문제

    public static String solution(String s) {
        String result="No";
        char[] a =new char[s.length()];
        char[] b =new char[s.length()];
        String s_a ="";
        String s_b="";
        for(int i = 0 ; i<s.length(); i++){
            a[i]= s.charAt(i);
            b[s.length()-i-1] = s.charAt(s.length()-i-1);
            s_a+=a[i];
            s_b +=b[s.length()-i-1];
        }

        if(s_a.equals(s_b))
            return "Yes";



        return result;
    }

}
