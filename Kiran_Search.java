 
import java.util.Scanner;
 
class Kiran_Search 
{
  public static void main(String args[])
  {
	boolean success = false;
	while (!success) {
	try{
    int c, n,i, search, array[];
 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = s.nextInt(); 
	if(n==0)
	{
		System.out.println("Enter a valid data");
		continue;
		
	}
	
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0,i=1; c < n; c++,i++)
	{
	System.out.println("Enter number"+i+":");
      
	while (!s.hasNextInt())
            {        
                    s.next(); // Read and discard offending non-int input
                    System.out.print("Please enter an integer: "); // Re-prompt
            }
	array[c] = s.nextInt();
 	}
    System.out.println("Enter value to find");
    search =s.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
          break;
      }
   }


   if (c == n)  /* Searching element is absent */
      System.out.println(search + " is not present in array.");
break;
}catch(Exception e){
	System.out.println("Enter a valid no");
	}
}
 
	
  }
}
