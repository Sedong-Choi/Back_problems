package com.company.test.success;

import java.util.*;
import java.io.*;

public class Pro_Rank_0929_01{
    //Day 22: Binary Search Trees
    //node 의 height를 계산하는 알고리즘


    public static int getHeight(Node root){
        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = getHeight(root.left) + 1;
        }
        if (root.right != null) {
            heightRight = getHeight(root.right) + 1;
        }
        System.out.println("root.data  = "+root.data);
        System.out.println("heightLeft = "+heightLeft);
        System.out.println("heightRight = "+heightRight);
        return (heightLeft > heightRight ? heightLeft : heightRight);

    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
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
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
*/

