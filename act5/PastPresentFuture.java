package act5;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.text.ParseException;


public class PastPresentFuture {
    public static void main(String[] args) throws ParseException {
        var sc = new Scanner(System.in);
        String[] criteria = {"Month: ", "Day: ", "Year: "};
        int[] values = new int[3];
        for(byte i = 0; i < 3; i++){
            System.out.print(criteria[i]);
            values[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();

        
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        calendar.setTime(dateNow);
        if(values[2] != calendar.get(Calendar.YEAR)) System.out.println("Date is not this year.");
        else if(values[0] < calendar.get(Calendar.MONTH) +1) System.out.println("Date is earlier month this year.");
        else if(values[0] > calendar.get(Calendar.MONTH) +1) System.out.println("Date is later month this year.");
        else  System.out.println("Date is this month.");
       
    }
}
