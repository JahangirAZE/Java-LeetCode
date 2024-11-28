class Solution {
  public boolean isIsomorphic(String s, String t)
  {
    HashMap<Character, Character> hashmap = new HashMap<>();
    for (int i = 0; i < s.length(); i++)
    {
      char original = s.charAt(i);
      char replacement = t.charAt(i);

      if (!hashmap.containsKey(original))
      {
        if (!hashmap.containsValue(replacement))
        {
          hashmap.put(original, replacement);
        }
        else return false;
      }
      else 
      {
        char mappedChar = hashmap.get(original);
        if (replacement != mappedChar) return false;
      }
    }
    return true;
  }
}
