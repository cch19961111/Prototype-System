package com.example.demo;

public class train {

    static class A{
        protected int student(int a,int b){
            System.out.println("a");
            return 0;
        }
        public Object student(int a){
            System.out.println("b");
            return 0;

        }
        public void x(){
            System.out.println("111");
            xx();
        }
        public void xx(){
            System.out.println("2222");
        }

    }
     static class B extends A{
        public String student(int a){
            System.out.println("c");
            return  "s";
        }
        public void xx(){
             System.out.println("xx");
         }
    }


        public static void main(String args[]) {

            new B().x();



        }

    }
