# Find_Element_That_Appears-Once
Given an array where every element occurs three times, except one element which occurs only once. Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.

 Examples :
 Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
 Output: 2
 
 # Solution:
 
 - From the array extract all elements in a set and get the sum of each element in set
  - Multiply the sum of set by 3, we will get thrice the sum of each element of the array.
  - Subtract the sum of the set from the sum of whole array
  - Divide the result by 2.
  - The number we get is the required number (which appears once in the array).

# Solution 2:
XOR all the values of the array together!  
Since XOR is  commutative and is its own inverse, each integer in the array that appears twice will  cancel itself out, and we'll be left with the integer we're looking for.  This takes O(n)  time and O(1) space.  
