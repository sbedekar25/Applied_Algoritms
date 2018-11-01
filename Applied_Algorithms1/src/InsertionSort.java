import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		//input
		
		 Scanner sc=new Scanner(System.in);
		  int arraySize=0;
		  int arrayElements[];
		  int temp=0;
		  int j=0;
				System.out.println("Enter the size of array");
				arraySize=sc.nextInt();
				arrayElements=new int[arraySize] ;
				for(int i=0;i<arraySize;i++)
				{
				 System.out.println("Enter the "+(i+1)+ " element");	
				 
				 arrayElements[i]=sc.nextInt();
				 System.out.println();
				}
		
		
		
		//insertion sort start
		
	
               int hold; /* get the element to be sorted( seeking a right place to place it)*/
               for ( int i =1; i < arraySize; i++)
               {
                   hold = arrayElements[i];                                  /*get a copy of the element to be sorted*/
                    
                    /*****find a position to insert that element*****/
                    /* if the current element, that is array[j-1] is larger than "hold", then move array[j-1] backward*/
                            /*leaving the position for "hold" or the element even smaller than "hold"*/
                            
                    /* if the current element array[j-1]is smaller than "hold", since the elements before array[j-1] are already sorted,*/
                            /*just stop, since "hold" is already in the right place*/
                   /*repeat this process*/
                   
                   
                   for ( j =i ; j > 0 && arrayElements[j-1] > hold;j--)
                   {
                	   arrayElements[j] = arrayElements[j-1];  
                   }
                   arrayElements[j] = hold;

        }	
             //insertion sort end
               
               //output
		for(int i=0;i<arraySize;i++)
		{
			System.out.println(arrayElements[i]+" ");
		}
		
		
		

	}

}
