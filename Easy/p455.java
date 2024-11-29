class Solution {
  public int findContentChildren(int[] g, int[] s) {
    int happyChildren = 0;
    Arrays.sort(g);
    Arrays.sort(s);
    int p = 0;
    int q = 0;
    while (q < s.length && p < g.length)
    {
      if (g[p] <= s[q]) {
        happyChildren++;
        p++;
        q++;
      }
      else q++;
    }
    return happyChildren;
  }
}
