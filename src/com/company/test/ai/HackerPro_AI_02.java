package com.company.test.ai;

import java.util.Scanner;

public class HackerPro_AI_02 {
    //Bot saves princess2
    //주어진 것과 다르지만 알고리즘은 같다.

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
                matrix[i][j] = ""+ s.charAt(j);
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
        int horizontal = m_position[1] -p_position[1];
//        System.out.println("m = "+m_position[0]+", p = "+p_position[0]+", vertical = "+vertical);
        if(vertical>0){

                System.out.println("UP");
                matrix[m_position[0]][m_position[1]] = "-";
                matrix[m_position[0]-1][m_position[1]] = "m";

        }else if(vertical==0){
            if(horizontal>0){

                System.out.println("LEFT");
                matrix[m_position[0]][m_position[1]] = "-";
                matrix[m_position[0]][m_position[1]-1] = "m";


            }else if(horizontal==0){

            }else{

                System.out.println("RIGHT");
                matrix[m_position[0]][m_position[1]] = "-";
                matrix[m_position[0]][m_position[1]+1] = "m";

            }
        }else{

                System.out.println("DOWN");
                matrix[m_position[0]][m_position[1]] = "-";
                matrix[m_position[0]+1][m_position[1]] = "m";

        }




        for(int i =0; i<n;i++){
            for(int j =0; j<n ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        sc.close();
    }
}
