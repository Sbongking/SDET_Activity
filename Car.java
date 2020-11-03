package JavaAct;

public class Car {
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;
    Car() {
	tyres = 4;
	doors = 4;
    }

    public void displayCharacterstics(){
	System.out.println("Color is: " + color);
	System.out.println("Brand: " + make);
	System.out.println("Transmission: " + transmission);
	System.out.println("Gates: " + doors);
    	System.out.println("Wheels: " + tyres);
    }

    public void accelerate() {
	System.out.println("Car is moving.");
    }
	
    public void brake() {
	System.out.println("STOP.");
    }
}
