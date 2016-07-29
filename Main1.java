import java.io.*;
public class Main1{
	public static void main(String args[]){
       Maruti obj = new Ritz();
	
       obj.speed();
	obj.wheel();
	
    }
}

abstract  class Maruti {
    public abstract void speed();
	void wheel()
	{
		System.out.println("I have 4 wheels");
	}
	
}
class  Ritz extends Maruti{
	public Ritz()
	{
		System.out.println("Iam Ritz");
	}
	public void speed(){
		System.out.println("My speed is 80kmph");
	}
	
}

