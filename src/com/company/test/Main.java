package com.company.test;

import com.company.test.success.Pro_0901_01;
import com.company.test.success.Pro_10178;

public class Main {
    static Pro_0901_01 pro= new Pro_0901_01();
    public static void main(String[] args){
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        pro.solution(N,stages);
    }
}

