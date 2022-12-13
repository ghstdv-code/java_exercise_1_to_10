package act8;

public class Automobiles {
    private int Id, Year;
    private String Model, Make, Color;
    float mpg;
    Automobiles(int id, int year, String model, String make, String color, float mpg){
        this.Id = id;
        this.Year = year;
        this.Model = model;
        this.Make = make;
        this.Color = color;
        this.mpg = mpg;
    }

    public void setId(int id){this.Id = id;}
    public void setYear(int yr){this.Year = yr;}
    public void setModel(String model){this.Model = model;}
    public void setMake(String make){this.Make = make;}
    public void setColor(String color){this.Color= color;}
    public void setMPG(float mpg){this.mpg = mpg;}

    public int getId(){
        if(this.Id >= 0 && this.Id <= 9999) return this.Id;
        else return 0;
    }
    public int getYear(){
        if(this.Year >= 2000 && this.Year <= 2017) return this.Year;
        else return 0;
    }
    public String getModel(){return this.Model;}
    public String getMake(){return this.Make;}
    public String getColor(){return this.Color;}
    public float getMPG(){
        if(this.mpg >= 10 && this.mpg <= 60) return this.mpg;
        else return 0;
    }
}
