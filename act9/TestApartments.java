package act9;

import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) {
        Apartment[] apartment = {
            new Apartment(201, 4, 2, 480.0f),
            new Apartment(202, 2, 1, 430.0f),
            new Apartment(203, 2, 2, 210.0f),
            new Apartment(204, 3, 1, 200.0f),
            new Apartment(205, 1, 1, 120.0f),
            new Apartment(206, 5, 4, 850.0f)
        };

        var sc = new Scanner(System.in);
        String[] cat = {"Minimum number of Bedrooms: ", "Minimum number of Baths: ", "Maximum rent willing to pay: "};
        float[] values = new float[3];
        for(int i = 0; i < 3; i++){
            System.out.print(cat[i]);
            values[i] = sc.nextFloat();
            sc.nextLine();
        }
        sc.close();

        showAvailable(apartment, values);
    }

    static void showAvailable(Apartment[] apartment, float[] values){ 
        for (Apartment appart : apartment) {
            var sb = new StringBuilder();
            if((appart.getBedCount() <= (int)values[0] &&  appart.getBathCount() <= (int)values[1]) && appart.getRent() <= values[2]){
                sb.append(String.format("Room Number    : %d\n", appart.getNumber()));
                sb.append(String.format("Bedrooms       : %d\n", appart.getBedCount()));
                sb.append(String.format("Bathrooms      : %d\n", appart.getBathCount()));
                sb.append(String.format("Rent           : $%.2f\n", appart.getRent()));
                System.out.println(sb.toString());
            }
        }
    }
}
