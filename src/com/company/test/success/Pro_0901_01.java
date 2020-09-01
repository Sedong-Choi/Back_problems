package com.company.test.success;

public class Pro_0901_01 {
//프로그래머스 실패율 문제
        public int[] solution(int N, int[] stages) {

            int[] answer = new int[N];
            int[] result =new int[N];

            //스테이지별로 카운트 하기위해
            int[][] count =new int[N][2];

            //count 에 stage 갯수 저장하기
            for(int i = 1;i<N+1; i++){
                count[i-1][0]=i ;
                count[i-1][1]=0;
                for(int j =0; j<stages.length ; j++){
                    if(stages[j]==i){
                        count[i-1][1]+=1;
                    }
                }
                System.out.println(count[i-1][0]+"번 = "+count[i-1][1]+"개");

            }



            //실패율
            long max = stages.length;
            long [][] asc = new long[stages.length][2];
            for(int i = 0; i<N ; i++){

                asc[i][0]= i+1;
                asc[i][1] =  count[i][1]*10000/max;
                System.out.println((i+1)+"번 실패율 = "+asc[i][1]);
                max = max- count[i][1];


            }
            long[][] temp=new long[1][2];
            for(int i = 0; i<N-1; i++){
                for(int j = i; j<N;j++){
                    if(asc[i][1]<asc[j][1]){
                        temp[0][1] = asc[j][1];
                        asc[j][1]=asc[i][1];
                        asc[i][1]=temp[0][1];
                        temp[0][0] = asc[j][0];
                        asc[j][0]=asc[i][0];
                        asc[i][0]=temp[0][0];
                    }
                }
            }

            for(int i =0; i<N;i++){

                answer[i]= (int)asc[i][0];
                System.out.println(asc[i][0]);
            }


            return answer;
        }
    }

