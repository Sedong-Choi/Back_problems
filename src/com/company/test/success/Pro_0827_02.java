package com.company.test.success;

public class Pro_0827_02 {
    // 정수 n 에따른 반복적인 문자열  출력 문제
    public  void solution() {
        int n = 3;
        String answer = "";
        String a = "수";
        String b = "박";

        for (int i = 0; i < n; i++) {
            if (i % 2 != 1) {
                answer += a;
            } else {
                answer += b;
            }
        }
    }

}

