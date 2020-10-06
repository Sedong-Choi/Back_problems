package com.company.test.success;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_Rank_1005_01 {
    //Day 23: BST Level-Order Traversal (BFS)
    //BFS 넓이 우선 탐색
    //DFS 깊이 우선 탐색



    public static void levelOrder(Node root){
        Queue<Node> result = new LinkedList<>();
        //우선 queue 에 node를 입력한다.
        result.add(root);

        //queue 가 다 없어질 때까지 반복
        while(!result.isEmpty()){
            //result.remove()는 현재 제거되는 Node 이다.

            Node current = result.remove();
            System.out.print(current.data+" ");

            if(current.left!=null) result.add(current.left);
            if(current.right!=null) result.add(current.right);

        }



    }

    public static Node insert1(Node root,int data){

        if(root==null){

            return new Node(data);

        }
        else{
            Node cur;
            if(data<=root.data){
                System.out.println("data =  "+data+" root.data = "+root.data);
                cur=insert1(root.left,data);
                System.out.println("cur.data = "+cur.data);
                root.left=cur;

            }
            else{
                System.out.println("data2 =  "+data+" root.data2 = "+root.data);
                cur=insert1(root.right,data);
                System.out.println("cur.data2 = "+cur.data);
                root.right=cur;

            }

            System.out.println("왔어유!");
            return root;
        }
    }

}
/*
main
Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert1(root,data);
        }
        levelOrder(root);
*/

