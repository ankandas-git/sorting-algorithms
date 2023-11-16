package com.mycompany.insertionsort;

import java.util.Arrays;

/**
 *
 * @author ankan
 */
public class InsertionSort {

    public static void main(String[] args) {
        int [] A ={10,30,20,40,60,50};
        int i,j;
        
        for(j=2; j<A.length; j++){
            int key = A[j];
            i = j-1;
           
            while(i >0 && A[j] >key){
               A[i+1] = A[j];
               i = i-1;
            }
        A[i+1] = key;
        }
        
        
        
      System.out.println(Arrays.toString(A));
    }
}
