package act10;

import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int dayofXmas;
        System.out.print("Enter days of christmas [1-12]: ");
        dayofXmas = sc.nextInt();
        sc.close();
        String str = "";
        if(dayofXmas >= 1 && dayofXmas <= 12){
            switch(dayofXmas){
                case 1:
                    str = String.format("On the %dst day of Christmas, my true love sent to me", dayofXmas);
                    break;
                case 2:
                    str = String.format("On the %dnd day of Christmas, my true love sent to me", dayofXmas);
                    break;
                case 3:
                    str = String.format("On the %drd day of Christmas, my true love sent to me", dayofXmas);
                    break;
                default:
                    str = String.format("On the %dth day of Christmas, my true love sent to me", dayofXmas);
                    break;
            }

            System.out.println(str);
            switch (dayofXmas) {
                case 12:
                    System.out.println("12 drummers drumming");
                case 11:
                    System.out.println("11 pipers piping");
                case 10:
                    System.out.println("10 lords-a-leaping");
                case 9:
                    System.out.println("9 ladies dancing");
                case 8:
                    System.out.println("8 maids-a-milking");
                case 7:
                    System.out.println("7 swans-a-swimming");
                case 6:
                    System.out.println("6 geese-a-laying");
                case 5:
                    System.out.println("5 golden rings");
                case 4:
                    System.out.println("4 calling birds");
                case 3:
                    System.out.println("3 french hens");
                case 2:
                    System.out.println("2 turtle doves");
                case 1:
                    System.out.println("And a partridge in a pear tree!");
                    break;
                }
        }
    }
}
