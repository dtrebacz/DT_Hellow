public class Lab3_3_1 {
    public static void main(String[] args) {

        int year = 2018;

        for(int month = 1; month <=12; month++) {
            for (int day = 1; day <= DayCounter.countDays(month, year); day++) {
                System.out.println(day + "/" + month + "/" + year);
            }
        }

    }




}
