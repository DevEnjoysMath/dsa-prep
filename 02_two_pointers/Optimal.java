class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int i = 0; // left pointer
      int j = numbers.length - 1; // right pointer

      while(i < j){
        if (numbers[i] + numbers[j] < target){
            i++;
        } else if (numbers[i] + numbers [j] > target){
            j--;
        } else{
            return new int[]{i + 1, j + 1};
        }
      }
      return null;
    } 
}