package com.company.test.success;

import java.util.Scanner;

public class Pro_Rank_0902_02 {
    //input

    //2
    //0 2 10
    //5 3 5

    //Expect output
    // input 2 => null
    // input 0 2 10 => 2 6 14 30 62 126 254 510 1022 2046
    // input 5 3 5 => 8 14 26 50 98

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] result = new int[n];


            for(int j = 0;j<n;j++){
                result[j]= a;
                for(int k = 0 ; k<j+1;k++){
                    result[j] +=b*(Math.pow(2,k));

                }

            }
            for(int j = 0 ;j<n ; j++){

                if(j == (n-1)){
                    System.out.print(result[j]);
                }else{
                    System.out.print(result[j]+" ");
                }
            }
            System.out.println();

        }
        in.close();
    }


}
