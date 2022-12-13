package act3;

import java.util.Scanner;

public class CondoSales2 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var sb = new StringBuilder();
        byte option = 0;
        int price = 0;
        boolean isValid = false, validFlag = true;
        sb.append("Please select view:\n");
        sb.append("[1] Park view\n");
        sb.append("[2] Golf Course view\n");
        sb.append("[3] Lake view\n");
        System.out.println(sb.toString());

        System.out.print("Enter your option: ");
        option = sc.nextByte();
       
        switch(option){
            case 1:
                isValid = true;
                price = 150000;
                break;
            case 2:
                isValid = true;
                price = 170000;
                break;
            case 3:
                isValid = true;
                price = 210000;
                break;   
            default:
                price = 0;
                break;     
        }

        sb.setLength(0);
        if(isValid){
            sb.append("Select Garage Option: \n");
            sb.append("[1] Garage\n");
            sb.append("[2] Parking Space\n");
            System.out.println(sb.toString());
            sc.nextLine();
            System.out.print("Enter your option: ");
            option = sc.nextByte();
            if(option == 1) price += 5000;
            else if(option == 2);
            else validFlag = false;
        }
        sc.close();
        sb.setLength(0);
        sb.append("Condominium Price is: $" + price + "\n");
        if(validFlag == false && isValid == true){
            sb.append("Parking option Invalid\n");
        }
        
        System.out.println(sb.toString());    
    }
}
