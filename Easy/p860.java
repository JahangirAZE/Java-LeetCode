class Solution {
  public boolean lemonadeChange(int[] bills) {
    if (bills[0] == 10 || bills[0] == 20 || bills[1] == 20) return false;
    
    int fives = 0;
    int tens = 0;
    for (int bill : bills) 
    {
      if (bill == 5) fives++;
      else if (bill == 10) 
      {
        if (fives == 0) return false;
        fives--;
        tens++;
      }
      else
      {
        if (tens > 0 && fives > 0) 
        {
          tens--;
          fives--;
        }
        else if (fives >= 3) 
        {
          fives -= 3;
        }
        else 
        {
          return false;
        }
      }
    }
    return true;
  }
}
