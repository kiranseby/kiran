class Car{
	
	public void vehicleType()
	{
		System.out.println("Vehicle Type: Car");
	}
}
class Maruti extends Car{
	
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max: 90Kmph");
	}
}
public class Ritz extends Maruti{

	
	 public void speed()
		{
			System.out.println("Max: 80Kmph");
		}
	 public static void main(String args[])
	 {
		 Ritz obj=new Ritz();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	 }
}
