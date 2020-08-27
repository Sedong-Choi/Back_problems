package com.company.test.success;

public class Pro_0827_03 {

    public void solution(){
        int[] arr;
        arr = new int[]{1,2,1,5};
        int[] answer = {};
        int n = arr.length;
        int min=arr[0];
        int minNum = 0;
        if(n == 1){
            answer= new int[]{-1};
        }else{
            System.out.println("왔다");
            for(int i =0; i<n;i++){
                for(int j =i+1; j<n;j++){
                    if(arr[i]>arr[j]){
                        if(min>arr[j]){
                            min = arr[j];
                            minNum = j;
                        }
                    }else{
                        if(min>arr[i]){
                            min = arr[i];
                            minNum = i;
                        }

                    }
                    System.out.println("minNum = " +minNum);
                }
            }

            System.out.println("min1 = "+min);

            int[] result =new int[n-1];
            for(int i =0; i<n-1;i++){
                if( minNum >i ){
                    result[i] =arr[i];
                }else if(minNum<=i){
                    result[i]=arr[i+1];
                }
            }

            answer = result;
        }
        System.out.print("[");
        for(int i =0; i<answer.length;i++){
            System.out.print(answer[i]+",");
        }
        System.out.print("\b]\n");
    }
}
