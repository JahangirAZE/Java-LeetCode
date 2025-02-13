class Solution {
  public int bitwiseComplement(int n) {
    int musk = 1;
    while (musk < n) 
    {
      musk = (musk << 1) | 1;
    }
    return musk ^ n;
  }
}
