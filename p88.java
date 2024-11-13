class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n)
  {
    int mIndex = m - 1, nIndex = n - 1, right = m + n - 1;
    while (nIndex >= 0)
    {
      if (mIndex >= 0 && nums1[mIndex] > nums2[nIndex])
      {
        nums1[right] = nums1[mIndex];
        mIndex--;
      }
      else
      {
        nums1[right] = nums2[nIndex];
        nIndex--;
      }
      right--;
    }
  }
}
