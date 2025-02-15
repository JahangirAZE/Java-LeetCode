class Solution {
  public int dayOfYear(String date) {
    String[] parts = date.split("-");
    int year = Integer.parseInt(parts[0]);
    int month = Integer.parseInt(parts[1]);
    int day = Integer.parseInt(parts[2]);

    int totalDays = 0;
    for (int i = 1; i < month; i++)
    {
      totalDays += getDays(i, year);
    }
    return totalDays + day;
  }
  
  private boolean isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  private int getDays(int month, int year) {
    return switch (month) 
    {
      case 2 -> isLeap(year) ? 29 : 28;
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      default -> 0;
    };
  }
}
