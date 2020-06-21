package com.example.demo;

import java.util.*;


public class Solution {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */

    public void twoSum (int[] numbers, int target) {
        // write code here
        int n=numbers.length;
        int i;
        int j = 0;
        label:for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){

                if(numbers[i] + numbers[j] == target) {break label;}
            }
        }
        System.out.println(i);
        System.out.println(j);

    }
    public static void main(String[] args){
        int []A={1,2,3,4,5,6};
        int target=7;
        Solution s=new Solution();
        s.twoSum(A,target);
    }
}
