class Car{
	
	public void vehicleType()
	{
		System.out.println("Vehicle Type: Car");
	}
}
class Maruti extends Car{
	public Maruti()
	{
		System.out.println("Class Maruti");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max: 90Kmph");
	}
}
public class Maruti8 extends Maruti{

	 public Maruti8()
	 {
		 System.out.println("Maruti Model: 8");
	 }
	 public void speed()
		{
			System.out.println("Max: 80Kmph");
		}
	 public static void main(String args[])
	 {
		 Maruti8 obj=new Maruti8();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	 }
}
