package com.company.test.success;

public class Pro_Rank_0904_04 {
    //Java String Tokens

    //정규식( regular expression )과 split을 사용
    // + 는 반복됨을 의미     ",?." 라면 [,?.]+를 사용해서 "" 로 만들 수 있겠다.

    public void solution(){
        String s="";
        if(s.trim().length()==0 || s.trim().length()>400000){
            System.out.println("\" zzz\" = "+0);
        }else {
            s = s.trim();
            String[] sub = s.split("[!,?._'@ ]+");
            System.out.println(sub.length);
            for (int i = 0; i < sub.length; i++) {
                System.out.println(sub[i]);
            }
        }
    }


}
