class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character, Integer> hashmap = new HashMap<>();
    for (char c : ransomNote.toCharArray())
    {
      hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
    }
    for (char c : magazine.toCharArray())
    {
      if (hashmap.containsKey(c))
      {
        hashmap.put(c, hashmap.get(c) - 1);
        if (hashmap.get(c) == 0) hashmap.remove(c);
        if (hashmap.isEmpty()) return true;
      }
    }
    return false;
  }
}
