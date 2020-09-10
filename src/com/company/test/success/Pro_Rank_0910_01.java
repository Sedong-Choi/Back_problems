package com.company.test.success;

import java.util.Scanner;

public class Pro_Rank_0910_01 {
    //Java Regex
    // IP주소의 형식과 맞는지 판별하는 String pattern 만들기



    public void solution(){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }


}

class MyRegex{
    public String pattern="";
    MyRegex(){
        // \\d{1,2} =>  한 자리 또는 두 자리의 숫자
        //  (0|1)\\d{2}=> 백의 자리 숫자가 0 or 1 이고 2자리 숫자
        //  2[0-4]\\d => 200~249   백의자리 : 2  십의자리 :[0-4] 일의자리 : \\d or [0-9]
        //  25[0-5]=> 250~255
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";

        // String zeroTo255 ="[0-9]|[0-9][0-9]|2[0-4][0-9]|25[0-5]"; 직관적으로 쓸 수도 있다.
        pattern = zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255+"\\."+zeroTo255;

    }
}
