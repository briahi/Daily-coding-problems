package daily.coding.problem;

import java.util.HashSet;
import java.util.Set;

/**This problem was asked by Stripe.

        Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

        For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

        You can modify the input array in-place.
 **/
public class Day4MissingPositiveNumber {

    private int findMissingNumber(int[] ar){

        Set<Integer> set=new HashSet<>();
        // add elements to the set
        for (int v:ar){
            set.add(v);
        }
        int i=1;
        while(set.contains(i)) i++;
        return i;
    }

    public static void main(String[] args){
        int[] a={3, 4, -1, 1};
        boolean r=new Day4MissingPositiveNumber().findMissingNumber(a)==2;
        System.out.println("result is : " + r);
    }
}
