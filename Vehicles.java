package oop;

public class Vehicles {
	int tyres;
	String type;
	
	//Default Constructor
	Vehicles()
	{
		this.tyres=2;
		this.type="Passenger";
		System.out.println("No of tyres: "+tyres);
                System.out.println("Vehicle Type: "+type);
	}
	//Parameterized Constructor
        Vehicles(int tyres, String type)
        {
		this.tyres=tyres;
		this.type=type;
        }
    
        //Methods
        public void fuelType(String ftype)
        {
    	System.out.println("Fuel Type: "+ftype);
        }
	//Getters
		public int getTyres()
		{
			return this.tyres;
		}
		public String getType()
		{
			return this.type;
		}
		//Setters
		public void setTyres(int tyres)
		{
			this.tyres=tyres;
		}
	        public void setType(String type)
		{
			this.type=type;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" BIKE ");
		Vehicles bike  = new Vehicles();
		bike.fuelType("Petrol");
		System.out.println();
		
		//CAR
		System.out.println(" CAR ");
		Vehicles car  = new Vehicles();//Constructor is always invoked when the object is created
		car.setTyres(4);
        car.setType("Passenger");
        System.out.println("No of tyres: "+car.getTyres());
        System.out.println("Vehicle Type: "+car.getType());
        car.fuelType("Petrol/Diesel");
        System.out.println();
		
		//TRUCK
        System.out.println(" TRUCK ");
		Vehicles truck  = new Vehicles(6,"Goods");
		System.out.println("No of tyres: "+truck.getTyres());
        System.out.println("Vehicle Type: "+truck.getType());
        truck.fuelType("Diesel");
	}
}


