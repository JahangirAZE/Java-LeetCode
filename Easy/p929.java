class Solution {
  public int numUniqueEmails(String[] emails) {
    HashSet<String> hashset = new HashSet<>();
    for (String email : emails)
    {
      hashset.add(processEmail(email));
    }
    return hashset.size();
  }

  private String processEmail(String email) {
    String[] parts = email.split("@");
    StringBuilder fixedEmail = new StringBuilder();
    for (char c : parts[0].toCharArray())
    {
      if (c == '+') break;
      if (c == '.') continue;
      fixedEmail.append(c);
    }
    return fixedEmail.append('@').append(parts[1]).toString();
  }
}
