package com.company.test.success;

import java.util.Scanner;

public class Pro_Rank_0902_03 {
    public void solution() {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                //byte_plus = Math.pow(2,7)-1;
                if(x>=-128 && x<=127)System.out.println("* byte");
                //short_plus = Math.pow(2,15)-1;
                if(x>=-1*(Math.pow(2,15)) && x<=Math.pow(2,15)-1 )System.out.println("* short");
                //short_plus = Math.poww(2,31)-1;
                if(x>= -1*(Math.pow(2,31))&& x<=Math.pow(2,31)-1)System.out.println("* int");
                //long_plus = Math.poww(2,63)-1;
                if(x>=-1*(Math.pow(2,63)) && x<=Math.pow(2,63)-1 )System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        System.out.println("Math.pow(2,7) = "+Math.pow(2,7));
        System.out.println("Math.pow(2,15) = "+Math.pow(2,15));
        System.out.println("Math.pow(2,31) = "+Math.pow(2,31));
        System.out.println("Math.pow(2,63) = "+Math.pow(2,63));
    }



    }



