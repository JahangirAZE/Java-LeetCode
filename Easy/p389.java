class Solution {
  public char findTheDifference(String s, String t) {
    int[] freq = new int[26];
    for (int i = 0; i < t.length(); i++)
    {
      if (i < s.length()) {
        char c1 = s.charAt(i);
        freq[c1 - 'a']--;
      }
      char c2 = t.charAt(i);
      freq[c2 - 'a']++;
    }
    for (int i = 0; i < t.length(); i++)
    {
      if (freq[t.charAt(i) - 'a'] == 1) return t.charAt(i);
    }
    return 'a';
  }
}
