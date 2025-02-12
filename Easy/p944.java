class Solution {
  public int minDeletionSize(String[] strs) {
    int count = 0;
    for (int i = 0; i < strs[0].length(); i++)
    {
      char prev = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++)
      {
        char ch = strs[j].charAt(i);
        if (ch < prev)
        {
          count++;
          break;
        }
        prev = ch;
      }
    }
    return count;
  }
}
