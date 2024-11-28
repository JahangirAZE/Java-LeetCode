class Solution {
  public boolean isAnagram (String s, String t)
  {
    if (s.length() != t.length()) return false;
    int xorSum = 0;
    int[] frequency = new int[26];
    for (int i = 0; i < s.length(); i++)
    {
      xorSum ^= s.charAt(i) ^ t.charAt(i);
      frequency[s.charAt(i) - 'a']++;
      frequency[t.charAt(i) - 'a']--;
    }
    if (xorSum != 0) return false;
    for (int freq : frequency)
    {
      if (freq != 0) return false;
    }
    return true;
  }
}
