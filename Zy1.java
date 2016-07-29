//Downcasting
import java.io.*;
class veg
	{
		public void display()
		{
		System.out.println("vegg");
		}
	}
class apple extends veg 
	{
		public void dispaly()
		{
		System.out.println("apple");
		}
	}
public class Zy1
	{

     		public static void main (String args[ ]) 
		{
	        veg v = new veg ( );
        	apple a = (apple)v; 
		a.display();
     		}
	}
