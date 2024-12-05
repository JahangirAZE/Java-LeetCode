class Solution {
  public int[] constructRectangle(int area) {
    for (int width = (int) Math.sqrt(area); width > 0; width--)
    {
      if (area % width == 0) return new int[] {area / width, width};
    }
    return new int[] {area, 1};
  }
}
