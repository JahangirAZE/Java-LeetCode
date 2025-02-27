class Solution {
  
  private final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  
  public int daysBetweenDates(String date1, String date2) {
    return Math.abs(getDays(date1) - getDays(date2));
  }

  private int getDays(String date) {
    int[] dates = getYearMonthDay(date);
    int year = dates[0], month = dates[1], day = dates[2];

    int daysBeforeCurrentYear = 0;
    for (int y = 1971; y < year; y++) 
    {
      daysBeforeCurrentYear += isLeap(y) ? 366 : 365;
    }
    int daysOfCurrentYear = 0;
    for (int i = 0; i < month - 1; i++) 
    {
      daysOfCurrentYear += monthDays[i];
    }

    if (month > 2 && isLeap(year)) daysOfCurrentYear++;
    return daysBeforeCurrentYear + daysOfCurrentYear + day;
  }
  
  private int[] getYearMonthDay(String date) {
    int year = 0;
    for (int i = 0; i < 4; i++)
    {
      year = year*10 + date.charAt(i) - '0';
    }
    int month = (date.charAt(5) - '0')*10 + date.charAt(6) - '0';
    int day = (date.charAt(8) - '0')*10 + date.charAt(9) - '0';
    return new int[] {year, month, day};
  }

  private boolean isLeap(int year) {
    return year == 2100 ? false : year % 4 == 0;
  }
}
