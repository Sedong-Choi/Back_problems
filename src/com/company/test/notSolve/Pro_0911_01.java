package com.company.test.notSolve;

import java.util.*;

public class Pro_0911_01 {

    public int[] solution(String[][] genres, int[] plays) {
        int[] answer = {};
        int len = genres.length;
        Map<String,Integer> count = new HashMap<String,Integer>();
        //장르별 카운트
        Map<String,Integer> song_count = new HashMap<String, Integer>();
        //장르 갯수 카운트
        //장르별 카운트 하기
        List<Song> song = new ArrayList<Song>();
        for(int i =0 ; i< len;i++){
            count.put(genres[i][0],count.getOrDefault(genres[i],0)+plays[i]);
            song_count.put(genres[i][0], count.getOrDefault(genres[i],0)+1);
            song.add(new Song(i,genres[i][0],Integer.parseInt(genres[i][1])));
        }
//        Collections.sort(song);
        //장르 순서대로 정렬하기
        Map<Integer,Song> sortedsong = new HashMap<Integer,Song>();
        List<Integer> best = new ArrayList<Integer>();
        int start =0;
        for(int i =0; i<len-1; i++){
            for(int j = i+1; j<len ; j++){
                if(song.get(i).gen.equals(song.get(j).gen) && song.get(i).count >song.get(j).count){

                }else if(song.get(i).gen.equals(song.get(j).gen) && song.get(i).count <song.get(j).count){

                }
            }
        }


        return answer;
    }

    private class Song {
        int id;
        String gen;
        int count;

        Song(int id, String gen, int count){
            this.id = id;
            this.gen = gen;
            this.count = count;
        }
    }
}
