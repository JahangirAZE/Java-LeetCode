class Solution {
  public List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> matrix = new ArrayList<>();
    int first = 0;

    for (int i = 1; i <= s.length(); i++) 
    {
      if (i == s.length() || s.charAt(first) != s.charAt(i)) 
      {
        if (i - first >= 3) matrix.add(Arrays.asList(first, i - 1));
        first = i;
      }
    }
    return matrix;  
  }
}
