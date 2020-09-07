package com.company.test.notSolve;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pro_Rank_0904_07 {
    //Tag Content Extractor   levle = medium

    //html tag를 지워서 안의 String 만 뽑기
    //python scrapper 만들때 beautifulsoup.api 에서 사용하는게 같네 태그 지우기

    public void solution(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String tag ="";
            Pattern pattern;
            String tag_end="";
            int t_start=0;
            int t_end=0;


            int count =0;
            //몇개의 tag가 있는지 확인

            for(int i =0; i<line.length();i++){
                if(line.substring(i,i+1).equals("<")){
                    count++;
                }
            }

            //tag 는 시작과 끝이 있기 때문에 "<"카운트는 tag 의 2배이다.
            int tags = count/2;
            System.out.println("tags = "+tags);


            String[] tag_name = new String[tags];
             //tag찾기 시작
            while(tags > 0) {

                for(int i =0; i<line.length();i++) {
                    if (line.substring(i, i + 1).equals("<")) {
                        //지금 나온 tag 의 시작 index 저장
                        t_start = i;
                        for (int j = i; j < line.length(); j++) {
                            //">"가 나오면 tag 정의하기
                            if (line.substring(j, j + 1).equals(">")) {
                                //지금 선택된 tag 의 마침(">") index 저장
                                t_end = j;
                                //tag 및 tag_end 저장
                                tag = line.substring(0, j + 1);


                                for(int k = 0; k<tag_name.length;k++){
                                    if(tag_name[k]==null){
                                        tag_name[k]=tag;
                                    }
                                    System.out.println(tag_name[k]);
                                }


                                tag_end = tag.substring(0, 1) + "/" + tag.substring(1);
                                //j 에대한 for 나가기
                                break;
                            }
                        }


                        System.out.println("tag 찾고 남은 line = "+line);
                        tags--;
                    }
                }


            }
            testCases--;
        }
    }

    /*
1
<h1>Sanjay has no <h1>watch</h1></h1><h1>So wait for a while</h1>
    */

}
