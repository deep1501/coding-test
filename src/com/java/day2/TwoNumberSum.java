package com.java.day2;

public class TwoNumberSum {
    public static void main(String[] args) {
        int n = 14;
        int[] arr ={1,2,3,4,5,9};

        int[] nums = sumOfTwo(arr, n);
        for (int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    private static int[] sumOfTwo(int[] arr, int n) {

        int[] result = new int[2];
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]+arr[j] == n) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }
            }
        }
        return arr;
    }
}
