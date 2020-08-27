package com.company.test.success;

public class pro_0827_01 {
    //프로그래머스 문제 
    // String to int 변환 문제
    public static void main(String[] args) {

        String s ="10";
        int answer = solution(s);

        System.out.println("결과 = " +answer);
    }
    static int solution(String n){
        int answer = 0;
        String sub ="";
        boolean plus = true;
        int b =0;

        for(int i=0; i<n.length(); i++){
            sub = n.substring(i,i+1);

            int ten = n.length() -i;
            if(sub.equals("-")){
                System.out.println("마이너스 왔다");
                plus = false;
                ten = n.length()-1 -i;
            }

            switch(sub){
                case "1":
                    b=1;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "2":
                    b=2;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "3":
                    b=3;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "4":
                    b=4;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "5":
                    b=5;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "6":
                    b=6;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "7":
                    b=7;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "8":
                    b=8;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "9":
                    b=9;
                    for(int j =0; j< ten-1 ; j++)
                        b= b*10;
                    answer+= b;
                    break;
                case "0":
                    break;
                default:
                    break;

            }


        }

        if(!plus){
            answer = answer*(-1);
        }

        return answer;
    }
}
