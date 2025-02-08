class Solution {
  
  private String[] morses = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

  public int uniqueMorseRepresentations(String[] words) {    
    HashSet<String> hashset = new HashSet<>();
    for (String word : words) 
    {
      hashset.add(convertToMorse(word));
    }
    return hashset.size();
  }

  private String convertToMorse(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) 
    {
      sb.append(morses[c - 'a']);
    }
    return sb.toString();
  }
}
