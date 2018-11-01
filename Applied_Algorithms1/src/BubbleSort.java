import java.util.*;
import java.io.*;
public class BubbleSort {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int arraySize=0;
  int arrayElements[];
  int temp=0;
		System.out.println("Enter the size of array");
		arraySize=sc.nextInt();
		arrayElements=new int[arraySize] ;
		for(int i=0;i<arraySize;i++)
		{
		 System.out.println("Enter the "+(i+1)+ " element");	
		 
		 arrayElements[i]=sc.nextInt();
		 System.out.println();
		}
		
		//Bubble sort
        
            for (int j = 0 ; j < arraySize;j++)
            {
                for (int i = 0 ;i < arraySize-1-j;i++)
                    if (arrayElements[i] > arrayElements[i+1])                   /*for the jth time, let the jth largest element go to the tail*/
                    {
                    	temp=arrayElements[i];
                    	arrayElements[i]=arrayElements[i+1];
                    	arrayElements[i+1]=temp;
                    }
                        
            }
		
		//Bubble sort end
            //output
            
  for( int i=0;i<arraySize;i++){
	  System.out.print(arrayElements[i]+" ");
  }
		
		
	}

}
