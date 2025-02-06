class Solution {
  public char nextGreatestLetter(char[] letters, char target) {
    int left = 0;
    int right = letters.length - 1;
    while (left <= right) 
    {
      int middle = left + (right - left) / 2; 
      if (letters[middle] <= target) left = middle + 1;
      else right = middle - 1;
    }
    return letters[left % letters.length];
  }
}
