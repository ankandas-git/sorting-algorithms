package com.mycompany.mergesort;

public class MergeSort {
 
    public static void margeSort(int arr[],int si,int ei){
        if(si>=ei){ // Base Case 
            return;
        } 
        int mid = si+(ei-si)/2; // or (si+ei)/2 
        margeSort(arr,si,mid); // recursive method for left part sort
        margeSort(arr,mid+1,ei); // right part sort
        marge(arr,si,mid,ei); // combain two sorted array
    }
    
    public static void marge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1]; 
        int i =si; int j = mid+1; 
        int k = 0; // for temp array index
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++]; // left part any extra 
        } 
        while(j<=ei){
            temp[k++]=arr[j++]; // right part any extra 
        }
        
        //for copy temp to main array;
        for(k=0, i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    
    //for print sorted array
    public static void printArr(int arr[]){
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } 
    }
    //main method 
    public static void main(String[] args) {
       int arr[] = {7,2,9,1,5,3,8};

        margeSort(arr,0,arr.length-1);
        printArr(arr);
    } 
}

