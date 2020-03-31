// Types of classes
// 1. Brand
// 2. Car

class Brand {
    String name;
    String type;
    String location;
}

class Vehicle {
	private int wheels;

	Vehicle() {
		System.out.println("Inside the constructor of Vehicle...");
	}

	public int getWheels() {
		return this.wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}

class TwoWheeler extends Vehicle {
	TwoWheeler() {
		System.out.println("Inside the constructor of TwoWheeler...");
		this.setWheels(2);
	}
}

class Fourwheeler extends Vehicle {
	Fourwheeler() {
		System.out.println("Inside the constructor of Fourwheeler...");
		this.setWheels(4);
	}
}

class BasicCar extends Fourwheeler {
	Brand brand;
	String name;
	String engineType;
	int seats;
	String color;
	float cost;
	int windows;
	boolean ac;

	BasicCar() {
		System.out.println("Inside the constructor of BasicCar...");
	}
}

class SUVCar extends BasicCar {
	String carType;
	boolean roofWindow;
	String milegae;

	SUVCar() {
		this.carType = "SUV";
		this.milegae = "MEDIUM";		
	}	
}

class SportsCar extends BasicCar {
	String carType;
	boolean roofWindow;
	String milegae; 

	SportsCar() {
		System.out.println("Inside the constructor of SportsCar...");
		this.carType = "SPORTS";
		this.milegae = "LOW";		
	}
}

public class InheritancePlayground {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println(sportsCar.carType);
        System.out.println(sportsCar.milegae);
        System.out.println(sportsCar.getWheels());

        Vehicle vehicle = sportsCar;
		System.out.println(vehicle.getWheels());             
    }
}
