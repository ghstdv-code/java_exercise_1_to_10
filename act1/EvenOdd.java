package act1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = sc.nextInt();
        sc.close();

        if(input % 2 == 0) System.out.println(input + " is Even number.");
        else System.out.println(input + " is Odd number.");
    }
}