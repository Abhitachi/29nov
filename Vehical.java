package oop;

class Automobiles{
	String name;
	int cost;
	String colour;
	int wheels;
	int mileage;
	
	 Automobiles(String name,int cost,String colour,int wheels){
		this.name=name;
		this.cost=cost;
		this.colour=colour;
		this.wheels=wheels;
		System.out.println("name of vehicle is "+name);
		System.out.println("cost of "+name+" is "+cost);
		System.out.println("colour of "+name+" is "+colour);
		System.out.println("Number of wheels of "+name+" is "+wheels);
	}
	 
	 
	void SetMileage(int m) {
		mileage=m;
		
	}
	
	void GetMileage() {
		System.out.println("mileage of "+name+" is "+mileage);
	}
}
public class Vehical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automobiles bike=new Automobiles("Dukati",901000,"black",2);
		bike.SetMileage(20);
		bike.GetMileage();
		Automobiles car=new Automobiles("BMV",90100000,"blue",4);
		car.SetMileage(35);
		car.GetMileage();
		Automobiles Bus=new Automobiles("Redbus",9010000,"Red",4);
		Bus.SetMileage(55);
		Bus.GetMileage();
	}

}
