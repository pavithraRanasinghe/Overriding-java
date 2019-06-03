class Vehicle{
	public void park(int location){
		System.out.println("Vehicle parking...");
	}
}
class Car extends Vehicle{
	public void park(int location){
		System.out.println("Car parking...");
	}
}
class Van extends Vehicle{
	public void park(int location){
		System.out.println("Van parking...");
	}
}
class Bus extends Vehicle{
	public void park(int location){
		System.out.println("Bus parking...");
	}
}
class Overriding{
	public static void main(String args[]){
		Vehicle v1 = new Car();
		v1.park(1001);
		
		Vehicle v2 = new Van();
		v2.park(1001);
		
		Vehicle v3 = new Bus();
		v3.park(1001);
	}
}
