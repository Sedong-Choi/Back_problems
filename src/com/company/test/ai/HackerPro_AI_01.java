package com.company.test.ai;

import java.util.Scanner;

public class HackerPro_AI_01 {
    //Bot saves princess

    public void solution(){
        Scanner sc = new Scanner(System.in);
        //n*n 2차 배열 만들기
        int n = sc.nextInt();
        sc.nextLine();
        String[][] matrix = new String[n][n];
        String s= "";
        int[] p_position=new int[n];
        int[] m_position=new int[n];


        for(int i =0; i<n ; i++){
            s= sc.nextLine();
            for(int j =0; j<n;j++){
                matrix[i][j] = s.substring(j,j+1);
                if(matrix[i][j].equals("m")){
                    //m의 위치 저장 1,1일것임!!!
                    m_position[0]=i;
                    m_position[1]=j;
                }
                if(matrix[i][j].equals("p")){
                    //p의 위치 저장
                    p_position[0]=i;
                    p_position[1]=j;
                }
            }
        }
        int vertical =m_position[0] - p_position[0];
//        System.out.println("m = "+m_position[0]+", p = "+p_position[0]+", vertical = "+vertical);
        if(vertical>0){
            for(int i =0; i<vertical;i++) {
                System.out.println("UP");
            }
        }else{
            for(int i =0; i<Math.abs(vertical);i++) {
                System.out.println("DOWN");
            }
        }
        int horizontal = m_position[1] -p_position[1];
//        System.out.println("m = "+m_position[1]+", p = "+p_position[1]+",  horizontal= "+horizontal);
        if(horizontal>0){
            for(int i =0; i<horizontal;i++) {
                System.out.println("LEFT");
            }

        }else{
            for(int i =0; i<Math.abs(horizontal);i++) {
                System.out.println("RIGHT");
            }
        }



    }
}
