package act5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PastPresentFuture2 {
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

         SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        //Parsing the given String to Date object
        Date date = new Date();
		try {
			date = formatter.parse(values[1] + "-" + values[0] + "-" + values[2]);
		} catch (ParseException e) {
			e.printStackTrace();
		}

        System.out.println();
        if(date.before(formatter.parse(formatter.format(new Date())))) System.out.println(values[1] + "-" + values[0] + "-" + values[2] + " is past.");
        else if(date.after(formatter.parse(formatter.format(new Date())))) System.out.println(values[1] + "-" + values[0] + "-" + values[2] + " is future.");
        else System.out.println(values[1] + "-" + values[0] + "-" + values[2] + " is present.");

    }
}
