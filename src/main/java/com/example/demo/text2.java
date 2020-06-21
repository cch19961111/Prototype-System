package com.example.demo;

import java.util.HashMap;

public class text2 {
    String t1="a";
    String t2="b";
    int a=1;
    int b=1;



    public void cent1(){
        int a=1;
        String b="cc";
    }
    public void cent2(){
        int b=1;
        String d="cc";
    }
    public static void main(String[] args) {
        String a = "atrue";
        String b = "a" + "true";
        text2 t1=new text2();
        text2 t2=new text2();


        System.out.println((a == b));
        System.out.println((t1.t1 == t2.t1));
        System.out.println((t1.a == t2.b));
    }
}
