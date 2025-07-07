class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int i = 0; // left pointer
      int j = numbers.length - 1; // right pointer

      // If the sum in our window is less/greater than the target we move either of the pointers as needed to find the two indexes
      while(i < j){
        if (numbers[i] + numbers[j] < target){
            i++;
        } else if (numbers[i] + numbers [j] > target){
            j--;
        } else{
            // once we find target sum, we return the indexes and add 1 (as mentioned in the problem)
            return new int[]{i + 1, j + 1};
        }
      }
      return null;
    } 
}