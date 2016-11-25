class MonthApp {

  //Returns the number of the month if passed the name of the month
  public static int getMonthNumber(String month) {

    int monthNumber = 0;

    if(month == null) {
      return monthNumber;
    }

    switch (month.toLowerCase()) {
      case "january":
        monthNumber = 1;
        break;
      case "february":
        monthNumber = 2;
        break;
      case "march":
        monthNumber = 3;
        break;
      case "april":
        monthNumber = 4;
        break;
      case "may":
        monthNumber = 5;
        break;
      case "june":
        monthNumber = 6;
        break;
      case "july":
        monthNumber = 7;
        break;
      case "august":
        monthNumber = 8;
        break;
      case "september":
        monthNumber = 9;
        break;
      case "october":
        monthNumber = 10;
        break;
      case "november":
        monthNumber = 11;
        break;
      case "december":
        monthNumber = 12;
        break;
      default:
        monthNumber = 0;
        break;
    }

    return monthNumber;

  }

  //Main function
  public static void main(String args[]) {

    String month = "April";

    int returnedNumberOfMonth = MonthApp.getMonthNumber(month);

    System.out.println("The month you are looking for has number " + returnedNumberOfMonth);

  }
}
