class Solution {
  public int[][] flipAndInvertImage(int[][] image) {
    for (int i = 0; i < image.length; i++) 
    {
      int L = image[i].length;
      for (int j = 0; j < L / 2; j++) 
      { 
        int temp = image[i][j] ^ 1;
        image[i][j] = image[i][L - j - 1] ^ 1;
        image[i][L - j - 1] = temp;
      }
      
      if (L % 2 != 0) image[i][L / 2] ^= 1;
    } 
    return image;
  }
}
