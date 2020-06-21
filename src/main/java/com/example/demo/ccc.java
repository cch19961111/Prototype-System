package com.example.demo;

import java.util.Scanner;
import java.util.Set;

public class ccc {public static void main(String[] args) {



        Scanner in = new Scanner(System.in);


    int a[] = new int[8];

        int i = 0;
        int j;
int  actbbion;

        while (in.hasNextInt()) {

           int    a1= in.nextInt();

          int   a2= in.nextInt();
          a[1]=a2;
        }
        int n=a.length;
    System.out.println(n);

    System.out.println(a[1]);

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);

                }
            }
        }

    }

}
