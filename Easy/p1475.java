class Solution {
  public int[] finalPrices(int[] prices) {
    int[] result = new int[prices.length];
    for (int i = 0; i < prices.length; i++)
    {
      result[i] = prices[i] - getDiscount(prices, i);
    }
    return result;
  }

  private int getDiscount(int[] prices, int i) {
    for (int j = i + 1; j < prices.length; j++)
    {
      if (prices[j] <= prices[i]) return prices[j];
    }
    return 0;
  }
}
