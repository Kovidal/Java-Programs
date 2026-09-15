import java.util.Calendar;
import java.util.Date;

class Q25B {

    public static void main(String[] args) {

        Date date = new Date();

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Date and Time: " + date);

        System.out.println("Year: " +
                calendar.get(Calendar.YEAR));

        System.out.println("Month: " +
                (calendar.get(Calendar.MONTH) + 1));

        System.out.println("Day: " +
                calendar.get(Calendar.DAY_OF_MONTH));
    }
}