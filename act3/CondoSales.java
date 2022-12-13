package act3;

import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var sb = new StringBuilder();
        byte option = 0;
        int price = 0;
        sb.append("Please select view:\n");
        sb.append("[1] Park view\n");
        sb.append("[2] Golf Course view\n");
        sb.append("[3] Lake view\n");
        System.out.println(sb.toString());

        System.out.print("Enter your option: ");
        option = sc.nextByte();
        sc.close();

        switch(option){
            case 1:
                price = 150000;
                break;
            case 2:
                price = 170000;
                break;
            case 3:
                price = 210000;
                break;   
            default:
                price = 0;
                break;     
        }

        System.out.println("Condominium Price is: $" + price);
    }
}
