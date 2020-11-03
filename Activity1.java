package JavaAct;
public class Activity1{

    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2014;
        toyota.color = "Green";
        toyota.transmission = "Automatic";
    
      
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}