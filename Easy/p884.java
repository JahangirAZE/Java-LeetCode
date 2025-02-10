class Solution {
  public String[] uncommonFromSentences(String s1, String s2) {
    Map<String, Integer> hashmap = new HashMap<>();

    for (String s : s1.split(" "))
    {
      hashmap.put(s, hashmap.getOrDefault(s, 0) + 1);
    }
    for (String s : s2.split(" "))
    {
      hashmap.put(s, hashmap.getOrDefault(s, 0) + 1);
    }

    List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : hashmap.entrySet()) 
    {
      if (entry.getValue() == 1) list.add(entry.getKey());
    }
    
    return list.toArray(new String[0]);
  }
}
