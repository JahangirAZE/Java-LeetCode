class Solution {
  public boolean checkRecord(String s) {
    int absences = 0;
    for (int i = 0; i < s.length(); i++) 
    {
      char c = s.charAt(i);
      if (c == 'A') 
      {
        absences++;
        if (absences > 1) return false;
      } 
      if (i >= 2 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') return false;
    }
    return true;
  }
}
