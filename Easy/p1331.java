class Solution {
  public int[] arrayRankTransform(int[] arr) {
    int[] temp = new int[arr.length];
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    for(int i = 0; i < arr.length; i++)
    {
      temp[i] = arr[i];
    }
    Arrays.sort(temp);
    int rank = 1;
    
    for(int i = 0; i < temp.length; i++)
    {
      if(i > 0 && temp[i] != temp[i - 1]) rank++;
      hashmap.put(temp[i], rank);
    }
    
    int[] result = new int[arr.length];
    for(int i = 0; i < arr.length; i++)
    {
      result[i] = hashmap.get(arr[i]);
    }
    return result;
  }
}
