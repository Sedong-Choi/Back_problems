package com.company.test.success;

public class Pro_Rank_0904_03 {
    //anagram  가능한지에 대한 문제

    //두 글자의 길이가 달라도 확인해야 한다.

    public static String solution(String a, String b) {

        boolean ret = isAnagram(a,b);
        return ( ret ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        boolean result=false;
        if(a.length()!=b.length()){
            return result;
        }
        char[] A = a.toUpperCase().toCharArray();
        char[] B = b.toUpperCase().toCharArray();
        int count=0;
        char temp= 'a';
        for(int i =0; i<A.length-1;i++){
            for(int j =i+1 ; j<A.length ;j++){
                if(A[i]>A[j]){
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }

            }
        }
        for(int i =0; i<B.length-1;i++){
            for(int j =i+1 ; j<B.length ;j++){
                if(B[i]>B[j]){
                    temp = B[j];
                    B[j] = B[i];
                    B[i] = temp;
                }

            }
        }
        //작은 것을 len으로 초기화
        int len = (A.length>B.length) ? B.length : A.length;
        for(int i =0; i<len;i++){
            if(A[i]==B[i]){
                count++;
            }
            System.out.print("A["+i+"] = "+A[i]+" B["+i+"] = "+B[i]+" count = "+count+"\n");
            if(A.length>B.length && i== len-1){
                for(int j = i+1; j<A.length;j++){
                    if(A[j]==B[i]){
                        count++;
                    }
                    System.out.print("A["+j+"] = "+A[j]+" B["+i+"] = "+B[i]+" count = "+count+"\n");
                }
            }else if(A.length<B.length && i==len-1){
                for(int j = i+1; j<B.length;j++){
                    if(A[i]==B[j]){
                        count++;
                    }
                    System.out.print("A["+i+"] = "+A[i]+" B["+j+"] = "+B[j]+" count = "+count+"\n");
                }
            }
        }
        if(count >= len){
            result=true;
        }
        return result;
    }

}
