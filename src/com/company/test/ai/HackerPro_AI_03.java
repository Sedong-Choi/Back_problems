package com.company.test.ai;

import java.util.Scanner;

public class HackerPro_AI_03 {
    //BotClean


    public void solution() {
        int[] bot_position = new int[2];
        String[] board_position = new String[5];
        Scanner sc = new Scanner(System.in);

        // bot 위치 초기화
        for(int i =0; i<2;i++) bot_position[i]=sc.nextInt();
        // board 위치 초기화 b(bot), d(dirty), -(clean) 가 존재함
        for(int j=0; j<5;j++) board_position[j]= sc.next();
        next_move(bot_position[0],bot_position[1],board_position);
    }
    static void next_move(int posX, int posY, String[] board){
        int botX = posX;
        int botY = posY;
        int step =100;

        int dirtyX =0;
        int dirtyY =0;
        boolean forward= false;

        for(int i =0; i<5;i++){
            for(int j =0; j<5; j++){
                 if(board[i].charAt(j)=='d'){
                     int dist = Math.abs(botX -i) + Math.abs(botY -j);
                     if(step > dist){
                         dirtyX=i;
                         dirtyY=j;
                         step = dist;
                     }

                 }
            }
        }


        if( botX> dirtyX){
            System.out.println("UP");
            forward = true;
        }else if(botX<dirtyX){
            System.out.println("DOWN");
            forward = true;
        }

        if(forward == false){
            if(botY> dirtyY){
                System.out.println("LEFT");
                forward = true;
            }else if( botY< dirtyY){
                System.out.println("RIGHT");
                forward = true;
            }
        }

        if (step==0){
            System.out.println("CLEAN");
        }

    }
}
