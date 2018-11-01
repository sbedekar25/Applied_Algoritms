import java.util.Arrays;
import java.util.Scanner;

public class MS {

	public static void main(String[] args) {
		//Input
		 Scanner sc=new Scanner(System.in);
		  int arraySize=0;
		  int arrayElements[];
		  MS MS = new MS();
	      
		  System.out.println("Enter the size of array");
				arraySize=sc.nextInt();
				arrayElements=new int[arraySize] ;
				for(int i=0;i<arraySize;i++)
				{
				 System.out.println("Enter the "+(i+1)+ " element");	
				 
				 arrayElements[i]=sc.nextInt();
				 System.out.println();
				}		
				MS.Merge_Sort(arrayElements,0,arraySize-1);
				System.out.println();
				for(int i=0;i<arraySize;i++)
				{
					System.out.print(arrayElements[i]+" ");
				}
	}
	
	public  void Merge(int anyarray[], int begin, int mid, int end)
	{
		  // Find sizes of two subarrays to be merged
      
 
        /*first part of the array*/
        int  begin1 = begin;
        int  end1   = mid;
        /*second part of the array*/
        int begin2 = mid +1;
        int end2   = end;
        
        
        /* Create temp arrays */
        int temp1[] = new int [end1-begin1+1];
        int temp2[] = new int [end2 - begin2+1];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<end1-begin1+1; ++i)
        	temp1[i] = anyarray[begin + i];
        for (int j=0; j<(end2 - begin2+1); ++j)
        	temp2[j] = anyarray[mid+ 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = begin;
    	  System.out.println(i+" "+(end1-begin1+1)+" "+j+" "+(end2 - begin2+1));
        while (i < end1-begin1+1 && j < (end2 - begin2+1))
        {
            if (temp1[i] <= temp2[j])
            {
            	anyarray[k] = temp1[i];
                i++;
            }
            else
            {
            	anyarray[k] = temp2[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < (end1-begin1+1))
        {
        	anyarray[k] = temp1[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < (end2 - begin2+1))
        {
        	anyarray[k] = temp2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(anyarray));
		
       }
	public  void Merge_Sort(int anyarray[], int begin, int end)
	{
            int mid = 0;
            if ( begin < end)
            {
                mid = (begin+end)/2;
                Merge_Sort(anyarray,begin,mid);
                Merge_Sort(anyarray,mid+1,end);
                Merge(anyarray,begin,mid,end);
            }

	}

}
