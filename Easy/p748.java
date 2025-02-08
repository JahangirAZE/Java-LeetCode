class Solution {
  public String shortestCompletingWord(String licensePlate, String[] words) {
    int[] freq = new int[26];
    for (char c : licensePlate.toLowerCase().toCharArray())
    {
      if (Character.isAlphabetic(c)) freq[c-'a']++;
    }

    String result = "";
    for (String word : words)
    {
      if (isCompleting(word, freq) && (result.isEmpty() || result.length() > word.length())) result = word;
    }
    return result;
  }
  
  private static boolean isCompleting (String word, int[] frequency) {
    int[] wordFrequency = new int[26];
    for (char c : word.toCharArray()) 
    {
      wordFrequency[c - 'a']++;
    }

    for (int i = 0; i < wordFrequency.length; i++) 
    {
      if (wordFrequency[i] < frequency[i]) return false;
    }
    return true;
  }
}
