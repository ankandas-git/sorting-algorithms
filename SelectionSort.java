package com.mycompany.selectionsort;

import java.util.Arrays;

/**
 *
 * @author ankan
 */
public class SelectionSort {

    public static void main(String[] args) {
    int[] A = {20,30,10,40,60,50};
    
    int i,j;
        for ( i = 0; i < A.length ; i++) {
            int min = i;
            
            for(j = i+1; j<A.length;j++){
                if(A[j] < A[min]){
                min = j;
                }         
            }
        
          int temp = A[i];
          A[i] = A[min];
          A[min] = temp;
          
        }
        
        System.out.println(Arrays.toString(A));    
        
    }
}
