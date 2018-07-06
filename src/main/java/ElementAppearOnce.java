/**

 Find the element that appears once
 Given an array where every element occurs three times, except one element which occurs only once.
 Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.

 Examples :
 Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
 Output: 2

 */

package main.java;

import java.util.HashSet;
import java.util.Set;

public class ElementAppearOnce {

  /*
  Solution:

  - From the array extract all elements
  - Add each number once and multiply the sum by 3, we will get thrice the sum of each element of the array.
  - Store it as thrice_sum.
  - Subtract the sum of the whole array from the thrice_sum and divide the result by 2.
  - The number we get is the required number (which appears once in the array).

   */
  public int getUniqueElementFromArray(int[] arr){
    Set<Integer> set = new HashSet<>();
    int sum = 0;
    for (int i =0; i<arr.length; i++){
      sum += arr[i];
      set.add(arr[i]);
    }

    //calculates sum of set
    int sumOfSet = set.stream().mapToInt(Integer::intValue).sum();

    return ((3 * sumOfSet) - sum) / 2;
  }

}
