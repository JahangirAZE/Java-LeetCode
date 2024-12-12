class Solution {
  public boolean judgeCircle(String moves) {
    int[] freq= new int[128];
    for (char c : moves.toCharArray())
    {
      freq[c]++;
    }
    return freq['U'] == freq['D'] && freq['L'] == freq['R'];
  }
}
