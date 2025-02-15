class Solution {
  public int countCharacters(String[] words, String chars) {
    int[] freqChars = new int[26];
    for (char c : chars.toCharArray())
    {
      freqChars[c - 'a']++;
    }

    int total = 0;
    for (String word : words)
    {
      if (checkIfGood(word, freqChars)) total += word.length();
    }
    return total;
  }

  private boolean checkIfGood(String word, int[] freqChars) {
    int[] freqWord = new int[26];
    for (char ch : word.toCharArray())
    {
      freqWord[ch - 'a']++;
      if (freqWord[ch - 'a'] > freqChars[ch - 'a']) return false;
    }
    return true;
  }
}
