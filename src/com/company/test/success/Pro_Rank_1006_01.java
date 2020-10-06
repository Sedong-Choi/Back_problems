package com.company.test.success;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pro_Rank_1006_01 {
    //Day 25: Running Time and Complexity

    public void solution(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int input;
        int count;
        while(len-->0){
            count=0;
            input  = sc.nextInt();
            for(int i=1; i*i<=input;i++){
                if(input%i ==0) count++;
            }
            if(input==1){
                System.out.println("Not prime");
            }
            else{
                if(count>1){
                    System.out.println("Not prime");
                }
                else{
                    System.out.println("Prime");
                }
            }
        }
        sc.close();
    }

}
