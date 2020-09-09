package com.company.test.success;

public class Pro_Rank_0909_01 {
    //Mini-Max Sum


    public void solution(){
        double meal_cost=12;
        int tip_percent=20;
        int tax_percent=8;
        int totalCost =0;
        double  a = meal_cost*tip_percent/100;
        double  b = meal_cost*tax_percent/100;
        double c = a+b;
        System.out.println(a);
        System.out.println(b);
        totalCost = (int) Math.round(meal_cost+c);

        System.out.println(totalCost);

    }


}
