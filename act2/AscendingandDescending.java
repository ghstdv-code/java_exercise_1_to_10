package act2;

import java.util.Scanner;

public class AscendingandDescending {
    public static void main(String[] args) {
        var sc  = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0; i <= 2; i++){
            System.out.print("Input a number: ");
            num[i] = sc.nextInt();
        }
        sc.close();

        int temp = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i; j < num.length;j++){
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }           
        }
        System.out.print("Ascending: ");
        ShowArray(num);


        for(int i = 0; i < num.length; i++){
            for(int j = i; j < num.length;j++){
                if(num[i] < num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }           
        }

        System.out.println();
        System.out.print("Descending: ");
        ShowArray(num);
    }

    static void ShowArray(int[] arr){
        for(int a:arr){
            System.out.print(a + " ");
        }
    }
}
