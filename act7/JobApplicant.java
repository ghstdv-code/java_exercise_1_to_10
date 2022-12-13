package act7;

public class JobApplicant {
    String name, phone;
    boolean wproc, ssheets, dbase, graphics;

    JobApplicant(String name, String phone, boolean wproc, boolean ssheets, boolean dbase, boolean graphics){
        this.name = name;
        this.phone = phone;
        this.wproc = wproc;
        this.ssheets = ssheets;
        this.dbase = dbase;
        this.graphics = graphics;
    }

    public String getName(){return name;}
    public String getPhone(){return this.phone;}
    public boolean getWproc(){return this.wproc;}
    public boolean getSsheets(){return this.ssheets;}
    public boolean getDbase(){return this.dbase;}
    public boolean getGraphics(){return this.graphics;}
}
