import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RQuickSort {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 RQuickSort RS=new RQuickSort();
		  int arraySize=0;
		  int arrayElements[];
	
				System.out.println("Enter the size of array");
				arraySize=sc.nextInt();
				arrayElements=new int[arraySize] ;
				for(int i=0;i<arraySize;i++)
				{
				 System.out.println("Enter the "+(i+1)+ " element");	
				 
				 arrayElements[i]=sc.nextInt();
				 System.out.println();
				}
				
				RS.RANDOMIZED_QUICK_SORT(arrayElements, 0, arraySize-1);	
				System.out.println(Arrays.toString(arrayElements));

	
	}
	public static int RANDOMIZED_PARTITION(int[] A, int p, int r) {
        int k = (int)Math.floor(Math.random() * (r - p + 1) + p);
        int x = A[k];
        int temp = A[r];
        A[r] = A[k];
        A[k] = temp;
              
        int i = p;
        for (int j = p; j < r; j++) {
            if (A[j] <= x) {
          	  
          	  temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i = i + 1;
            }
        }
         temp = A[i];
        A[i] = A[r];
        A[r] = temp;
                        
        return i;      
        }
	
	
	
	public void RANDOMIZED_QUICK_SORT(int A[],int p,int r)
	{ 
		if (p < r)
	    {
		 int q = RANDOMIZED_PARTITION(A,p,r);
			     RANDOMIZED_QUICK_SORT(A,p,q-1);
			     RANDOMIZED_QUICK_SORT(A,q+1,r);
		}
			    
	}

}
