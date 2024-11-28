class Solution {
  public int longestPalindrome(String s) {
    Map<Character, Integer> hashmap = new HashMap<>();
    boolean singleFlag = false;
    int result = 0;

    for(char c : s.toCharArray())
    {
      hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
    }
    for (Integer value : hashmap.values())
    {
      result += (value / 2) * 2;
      if (value % 2 != 0) singleFlag = true;
    }

    return (singleFlag) ? result + 1 : result;
  }
}
