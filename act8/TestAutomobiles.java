package act8;

public class TestAutomobiles {
    public static void main(String[] args) {
        Automobiles auto1 = new Automobiles(3655, 2012, "Prius", "Toyota", "Black", 12.5f);
        Automobiles auto2 = new Automobiles(1000, 2000, "Corona", "Toyota", "Red", 30);
        Automobiles auto3 = new Automobiles(12000, 1998, "Corona", "Toyota", "Red", 30);

        auto1.setColor("White");    // auto1 set color to white

        auto2.setModel("Civic");    // auto2 change model to Civic
        auto2.setMake("Honda");     // auto2 change make to Honda
        
        auto3.setMPG(68);           // auto3 change mpg to 68 from 30

        show(auto1);
        show(auto2);
        show(auto3);

    }

    static void show(Automobiles automobiles){
        var sb =  new StringBuilder();
        sb.append("\nCar ID   : " + automobiles.getId() + "\n");
        sb.append("Make     : " + automobiles.getMake() + "\n");
        sb.append("Model    : " + automobiles.getModel() + "\n");
        sb.append("Year     : " + automobiles.getYear() + "\n");
        sb.append("Color    : " + automobiles.getColor() + "\n");
        sb.append("MPG      : " + automobiles.getMPG() + "\n");
        System.out.println(sb.toString());
        
    }
}
