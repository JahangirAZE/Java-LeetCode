class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> hashmap = new HashMap<>();
    List<String> list = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < list1.length; i++)
    {
      hashmap.put(list1[i], i);
    }
    for (int i = 0; i < list2.length; i++)
    {
      String s = list2[i];
      if (hashmap.containsKey(s))
      {
        int sum = hashmap.get(s) + i;
        if (sum < min)
        {
          list.clear();
          list.add(s);
          min = sum;
        }
        else if (sum == min) list.add(s);
      }
    }
    return list.toArray(new String[0]);
  }
}
