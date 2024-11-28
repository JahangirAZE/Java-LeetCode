class Solution {
  public boolean wordPattern (String pattern, String s)
  {
    Map<Character, String> hashmap = new HashMap<>();
    String[] words = s.split(" ");
    if (pattern.length() != words.length) return false;
    for (int i = 0; i < pattern.length; i++)
    {
      char c = pattern.charAt(i);
      String word = words[i];

      if (hashmap.containsKey(c))
      {
        if (!hashmap.get(c).equals(word)) return false;
      }
      else if (hashmap.containsValue(word)) return false;
      hashmap.put(c, word);
    }
    return true;
  }
}
