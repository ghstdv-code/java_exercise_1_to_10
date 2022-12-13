package act9;

public class Apartment {
    private int Number;
    private int BedCount;
    private int BathCount;
    private float Rent;

    Apartment(int number, int beds, int baths, float rent){
        this.Number = number;
        this.BedCount = beds;
        this.BathCount = baths;
        this.Rent = rent;
    }

    public int getNumber(){return this.Number;}
    public int getBedCount(){return this.BedCount;}
    public int getBathCount(){return this.BathCount;}
    public float getRent(){return this.Rent;}
}
