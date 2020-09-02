package com.company.test.success;

import java.util.Scanner;
public class Pro_Rank_0902_01 {




        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                if(x >=100){
                    for(int j =s1.length()-1 ; j<14;j++){
                        s1+=" ";
                    }
                    System.out.println(s1+x);
                }else if(x<100 && x>=10){
                    for(int j =s1.length()-1 ; j<14;j++){
                        s1+=" ";
                    }
                    System.out.println(s1+"0"+x);
                }else if(x<10){
                    for(int j =s1.length()-1 ; j<14;j++){
                        s1+=" ";
                    }
                    System.out.println(s1+"00"+x);
                }
            }
            System.out.println("================================");



        }


}
