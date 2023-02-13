class Animal{
    void walk(){
        System.out.println("The animal can walk");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog can bark");
    }
}
class BullDog extends Dog{
    void aggression(){
        System.out.println("The Bulldogs are aggressive");
    }
}
public class AnimalDriver {
    public static void main(String[] args) {
        BullDog bd=new BullDog();
        bd.bark();
        bd.aggression();
        bd.walk();
    }
}

