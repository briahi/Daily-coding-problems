package daily.coding.problem;

import java.util.Arrays;

/**
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class Day2ProductOfAllNumbers {

    private  int[] productAllNumbers(int[] arr){
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] result=new int[n];
        left[0]=1; right[n-1]=1;
        for(int i=1;i<n;i++)
            left[i]=left[i-1]*arr[i-1];

        for(int j=n-2;j>=0;j--)
            right[j]=right[j+1]*arr[j+1];

        for(int i=0;i<n;i++){
            result[i]=left[i]*right[i];
            System.out.println(result[i]);
        }


        return result;
    }

    public static void main(String[] args){
        int[] a={1, 2, 3, 4, 5};
        int[] result={120, 60, 40, 30, 24};
        System.out.println("result is: " + Arrays.equals(new Day2ProductOfAllNumbers().productAllNumbers(a) ,result));
    }
}
