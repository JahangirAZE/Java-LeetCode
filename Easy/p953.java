class Solution {
  public boolean isAlienSorted(String[] words, String order) {
    int[] priority = new int[26];
    for (int i = 0; i < order.length(); i++)
    {
      priority[order.charAt(i) - 'a'] = i;
    }

    for (int i = 0; i < words.length - 1; i++)
    {
      for (int j = 0; j < words[i].length(); j++)
      {
        if (j >= words[i + 1].length()) return false;
        if (words[i].charAt(j) != words[i + 1].charAt(j))
        {
          int currentWordChar = words[i].charAt(j) - 'a';
          int nextWordChar = words[i + 1].charAt(j) - 'a';
          if (priority[currentWordChar] > priority[nextWordChar]) return false;
          else break;
        }
      }
    }
    return true;
  }
}
