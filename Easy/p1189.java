class Solution {
  public int maxNumberOfBalloons(String text) {
    int[] freq = new int[26];
    for (char c : text.toCharArray())
    {
      freq[c - 'a']++;
    }

    int count = 0;
    while (true) 
    {
      if (freq[1] > 0 && freq[0] > 0 && freq[11] > 1 && freq[14] > 1 && freq[13] > 0) 
      {
        count++;
        freq[1]--;
        freq[0]--;
        freq[11] -= 2;
        freq[14] -= 2;
        freq[13]--;
      } 
      else break;
    }
    return count;
  }
}
