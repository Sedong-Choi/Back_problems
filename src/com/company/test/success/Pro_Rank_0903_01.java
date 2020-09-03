package com.company.test.success;

import java.util.Scanner;

public class Pro_Rank_0903_01 {
    //hasNext()를 사용하는 방법!
    public void solution() {
        Scanner scan = new Scanner(System.in);
        for(int  i = 1; scan.hasNext()==true; i++){
            System.out.println(i +" "+scan.nextLine());
        }
    }
}



