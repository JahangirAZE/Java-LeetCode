class Solution {
  public char slowestKey(int[] releaseTimes, String keysPressed) {
    int maxDuration = releaseTimes[0];
    char resultKey = keysPressed.charAt(0);
    
    for (int i = 1; i < releaseTimes.length; i++)
    {
      int duration = releaseTimes[i] - releaseTimes[i - 1];
      char currentKey = keysPressed.charAt(i);
      
      if (duration > maxDuration || (duration == maxDuration && resultKey < currentKey))
      {
        maxDuration = duration;
        resultKey = currentKey;
      }
    }
    return resultKey;
  }
}
