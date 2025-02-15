class Solution {
  public int[] distributeCandies(int candies, int num_people) {
    int[] result = new int[num_people];
    int gift = 1;
    int i = 0;

    while (candies > 0)
    {
      if (candies < gift) 
      {
        result[i % num_people] += candies;
        break;
      } 
      else 
      {
        result[i % num_people] += gift;
        candies -= gift;
        gift++;
      }
      i++;
    }
    return result;
  }
}
