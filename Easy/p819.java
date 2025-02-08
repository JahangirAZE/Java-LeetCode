class Solution {
  public String mostCommonWord(String paragraph, String[] banned) {
    String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
    HashMap<String, Integer> hashmap = new HashMap<>();
    HashSet<String> hashset = new HashSet<>(Arrays.asList(banned));

    for (String word : words) 
    {
      if (!word.isEmpty() && !hashset.contains(word))
      {
        hashmap.put(word, hashmap.getOrDefault(word, 0) + 1);
      }
    }
    return Collections.max(hashmap.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
}
