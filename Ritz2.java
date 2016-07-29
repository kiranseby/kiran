import java.io.*;
 interface Maruti {
    public  void speed();
    public  void wheel();
	
}
class  Ritz2 implements Maruti{
	public Ritz2()
	{
		System.out.println("Iam Ritz");
	}
	public void speed(){
		System.out.println("My speed is 80kmph");
	}
	public void wheel()
	{
		System.out.println("I have 4 wheels");
	}
	public static void main(String args[]){
        Maruti obj = new Ritz2();
        obj.speed();
	obj.wheel();
    }
}
