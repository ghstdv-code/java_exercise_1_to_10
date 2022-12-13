package act6;

import java.util.Scanner;

public class Pay {
    public static void main(String[] args) {
        var sc  = new Scanner(System.in);
        var sb = new StringBuilder();
        float rate = 0, deductions = 0, reggrosspay = 0, ot = 0, netpay;
        byte opt = 0, opt2;
        int hrs = 0;
        System.out.print("Enter skill level[1-3]: ");
        opt = sc.nextByte();
        sc.nextLine();

        System.out.print("Enter attended hours: ");
        hrs = sc.nextInt();
        sc.nextLine();

        rate = getRate(opt);
        if(hrs <= 40){
            reggrosspay = hrs * rate;
            netpay = reggrosspay;
         }
         else{
             if((hrs / 40) > 1){
                ot = ((((hrs / 40.0f) * 40.0f) - 40.0f) + (hrs % 40)) * (rate + (rate / 2));
                reggrosspay = 40.0f * rate;
                netpay = reggrosspay + ot;
            }
            else{
                ot = (hrs % 40.0f) * (rate + (rate / 2));
                reggrosspay = 40.0f * rate;
                netpay = reggrosspay + ot;
            }
         }
        
        if(opt > 0 && opt <= 3){
            if(opt > 1){
                sb.append("\nSkill Options: \n");
                sb.append("[1] Medical\n");
                sb.append("[2] Dental\n");
                sb.append("[3] Long-Term disability insurance\n\n");
                System.out.print(sb.toString());
                System.out.print("Enter your option: ");
                opt2 = sc.nextByte();
                deductions = getInsurance(opt2);
                sc.nextLine();

                if(opt == 3){
                    sb.setLength(0);
                    sb.append("\nAvail retirement plan?\n");
                    sb.append("[1] Yes\n");
                    sb.append("[2] No\n\n");
                    System.out.print(sb.toString());
                    System.out.print("Enter you option: ");
                    opt2 = sc.nextByte();
                    if(opt2 == 1) deductions += netpay * 0.03;
                  
                }
            }
        }
       sc.close();
       if(deductions <= netpay){
            sb.setLength(0);
            sb.append(String.format("\nHours Worked                   : %d\n", hrs));
            sb.append(String.format("Hourly Pay Rate                : $%.2f\n", rate));
            sb.append(String.format("Regular Hours Pay              : $%.2f\n", reggrosspay));
            sb.append(String.format("Overall Hourly Pay w/ Overtime : $%.2f\n", netpay));
            sb.append(String.format("Total Deductions               : $%.2f\n", deductions));
            sb.append(String.format("Net Pay                        : $%.2f\n", (netpay - deductions)));
            System.out.print(sb.toString());
       }
       else System.out.println("Error Inputs!");
        
        

    }

    static float getRate(byte level){
        float rate;
        switch(level){
            case 1:
                rate = 17;
                break;
            case 2:
                rate = 20;
                break;
            case 3:
                rate = 22;
                break;
            default:
                rate = 0;
                break;
        }
        return rate;
    }
    static float getInsurance(byte opt){
        float rate;
        switch(opt){
            case 1:
                rate = 32.5f;
                break;
            case 2:
                rate = 20;
                break;
            case 3:
                rate = 10;
                break;
            default:
                rate = 0;
                break;
        }
        return rate;
    }

}
