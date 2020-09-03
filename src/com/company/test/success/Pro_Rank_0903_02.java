package com.company.test.success;

import java.util.Scanner;
/* 제공된 기본

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


 이곳을 채워야 함


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class


*/
public class Pro_Rank_0903_02 {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag =true;
    static {// 이렇게도 사용할 수 있구나
        try {

            if (B < 0 || H < 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");

            }
        }catch (Exception e){
            System.out.print(e);
        }
    }

    //고정된 solution
    public static void solution(){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main


}//end of class



