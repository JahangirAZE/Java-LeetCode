class Solution {
  public double average(int[] salary) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i : salary)
    {
      max = Math.max(i, max);
      min = Math.min(i, min);
    }

    int total = 0;
    for (int i : salary)
    {
      if (i != max && i != min) total += i;
    }
    return (double) total / (salary.length - 2);
  }
}
