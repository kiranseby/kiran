//Java program to implement Merge Sort
// author:Kiran
import java.io.*;
import java.lang.*;
//class Merge11
public class Merge12
  {  public
        static int a[]=new int [10];
	static int n;	 
       public static void main(String args[])throws IOException
       {
	boolean success = false;
	while (!success) {
	try{
	DataInputStream d=new DataInputStream(System.in);
	System.out.println("Enter number of elements   :  ");
	n=Integer.parseInt(d.readLine());//n denotes the limit
	if(n==0)
	{
		System.out.println("Enter a valid data");
		continue;
		
	}
	System.out.println("Enter elements   :  ");
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter number"+i+":");
	  	a[i]=Integer.parseInt(d.readLine()); //numbers are inserted in an array named a  
      	}
    
	mergeSort(1,n);
        System.out.println("\nThe sorted array is    :  ");//displays the result i.e sorted array
        display(1,n);
	break;
	}catch(Exception e){
	System.out.println("Enter a valid no");
 //input.nextLine();
	}
	}
	
	}	
     
   
      public static void mergeSort(int l,int r)throws IOException
      { int mid;
        if(l<r)//only if l<r,we need to sort the array
         {
     	 mid=(l+r)/2;
 	System.out.println("\nDivide Operation  : ");
         display(l,mid);
	 // Below step sorts the left side of the array
	 mergeSort(l,mid);
      System.out.println("\nDivide Operation  : ");
         display(mid+1,r);
	// Below step sorts the right side of the array
         mergeSort(mid+1,r);
	 // Now merge both sides
 	 merge(l,mid,r);
         }
       }
    public static void merge(int l,int mid,int r)throws IOException
      {
	int i=l,j=mid+1,k=l;
	int aa[]=new int[10];
	while(i<=mid&&j<=r)
	 {
	   	if(a[i]<=a[j])
		 { aa[k]=a[i];
		   i++;
		   k++;
		 }
		else
		 {
		   aa[k]=a[j];
		   j++;
		   k++;
		 }
	
	 }
	if(i>mid)
	 {
		for(int p=j;p<=r;p++)
		 {
		   aa[k]=a[p];
		   k++;
		 }
	 }
	else if(i<=mid)
	 {
		for(int p=i;p<=mid;p++)
		 {
		   aa[k]=a[p];
		   k++;
		 }
	 }
       for(k=l;k<=r;k++)
	a[k]=aa[k];
        System.out.println("\nMerge Operation : ");
       display(l,r);
		
   }
   public static void display(int l,int r)throws IOException
     {   System.out.println(" ");
         for(int i=l;i<=r;i++)
         System.out.print(" "+a[i]);
         
     }
}
