class Bick {
    public String brand ;
    public int Sno;
    public int model;
    Bick(String brand,int Sno,int model) {
        this.brand=brand;
        this.Sno=Sno;
        this.model=model;
    }
    void newbick() {
        System.out.println(" best model " + brand + " : " + Sno + " : " + model + " : ");
    }
}
class Honda extends Bick {   
    Honda(String brand,int Sno,int model) {
        super(brand, Sno, model);
    }
    void updatVersion() {
        System.out.println(" best model " + brand + " : Honda +" + Sno + " 120 " + model + " : 2019 ");
    }
}
class Hf extends Honda {   
    Hf(String brand,int Sno,int model) {
        super(brand, Sno, model);
    }
    void updatVersion1() {
        System.out.println(" Hf updatVersion good competable\n");
        System.out.println(" best model " + brand + " : Hf19 + " + Sno + " : 140 " + model + " : 2022");
    }
}

public class Driver143 {
    public static void main (String arg[]) {
        Hf a=new Hf(" Hf ", 123, 2019);
        a.updatVersion();
        a.updatVersion1();
        a.newbick();
    }
}
