
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zorofast
 */
public class Time {

    public static void timeprint() {

        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        final Calendar cal = new GregorianCalendar();

        int d = cal.get(Calendar.DAY_OF_WEEK);//d = day

        if (d == 1) {
            System.out.print("Sunday");
        } else if (d == 2) {
            System.out.print("Monday");
        } else if (d == 3) {
            System.out.print("Tuesday");
        } else if (d == 4) {
            System.out.print("Wednesday");
        } else if (d == 5) {
            System.out.print("Thursday");
        } else if (d == 6) {
            System.out.print("Friday");
        } else if (d == 7) {
            System.out.print("Saturday");
        }
        printdate();
        System.out.print(" ,clock: " + date.format(now));

    }
    private final static Calendar call = new GregorianCalendar();
    private final static int mo = call.get(Calendar.MONTH) + 1;// mo = month

    public static void printdate() {

        switch (mo) {
            case 1:
                System.out.print(",January " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 2:
                System.out.print(",February " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 3:
                System.out.print(",March " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 4:
                System.out.print(",April " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 5:
                System.out.print(",May " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 6:
                System.out.print(",June " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 7:
                System.out.print(",July " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 8:
                System.out.print(",August " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 9:
                System.out.print(",September " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 10:
                System.out.print(",October " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 11:
                System.out.print(",November " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 12:
                System.out.print(",December " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            case 13:
                System.out.print(",January " + call.get(Calendar.DAY_OF_MONTH) + "," + call.get(Calendar.YEAR));
                break;
            default:
                break;
        }
    }
}
