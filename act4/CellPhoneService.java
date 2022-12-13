package act4;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        String[] criteria = {"talk minutes: ", "text message sent: ", "gigabytes date used: "};
        int[] consumes = new int[3];
        for(byte i = 0; i < 3; i++){
            System.out.print("Maximum " + criteria[i]);
            consumes[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();

        var sb = new StringBuilder();
        sb.append("\nRecommendation:\n");
        if(consumes[0] < 500 && consumes[1] <= 0 && consumes[2] <= 0) sb.append("Plan A at $49 per month\n");
        else if(consumes[0] < 500 && consumes[1] > 0 && consumes[2] <= 0) sb.append("Plan B at $55 per month\n");
        else if(consumes[0] >= 500 && consumes[1] <= 100 && consumes[2] <= 0) sb.append("Plan C at $61 per month\n");
        else if(consumes[0] >= 500 && consumes[1] >= 100 && consumes[2] <= 0) sb.append("Plan D at $70 per month\n");
        else if(consumes[0] >= 0 && consumes[1] >= 0 && consumes[2] > 0 && consumes[2] <= 2) sb.append("Plan E at $79 per month\n");
        else if(consumes[0] >= 0 && consumes[1] >= 0 && consumes[2] > 0 && consumes[2] >= 2) sb.append("Plan F at $87 per month\n");

        System.out.println(sb.toString());
    }
}
