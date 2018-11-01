import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
   boolean haszero =false;
	public static void main(String[] args) {
		//Input
		 Scanner sc=new Scanner(System.in);
		
		  MergeSort MS = new MergeSort();
		  int arrayElements[] ={1,3,1,6,1,1,2,3,5,9,8,3,4,10,0,23,-1,-1,0,5,5,5,5};
		  int arraySize=arrayElements.length;
//		  System.out.println("Enter the size of array");
//				arraySize=sc.nextInt();
//				arrayElements=new int[arraySize] ;
//				for(int i=0;i<arraySize;i++)
//				{
//				 System.out.println("Enter the "+(i+1)+ " element");	
//				 
//				 arrayElements[i]=sc.nextInt();
//				 System.out.println();
//				}		
		  for(int i =0;i<arrayElements.length;i++)
	         {
	        	 if(arrayElements[i] == 0)
	        	 {
	        		 MS.haszero=true;
	        		 break;
	        	 }
	         }
				MS.Merge_Sort(arrayElements,0,arraySize-1);	
				
				for(int i=0;i<arraySize;i++)
				{
					if(arrayElements[i]==0 && MS.haszero==true)
					{
						MS.haszero=false;
						System.out.print(arrayElements[i]+ " ");
					}
					
					if(arrayElements[i]!=0)
						{System.out.print(arrayElements[i]+ " ");}
				}
		       // System.out.println(Arrays.toString(arrayElements));

		        

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
       
        int temp[]=new int[anyarray.length];  
        int i = begin1, j = begin2;
        int k = begin1;
        int swap_temp=0;
        while (i <= end1 && j <= end2)
        {
            
        	if(anyarray[i]==anyarray[j])
        	{
        		swap_temp=anyarray[j];
        		anyarray[j] = anyarray[end2];
        		anyarray[end2]=swap_temp;
        		end2=end2-1;
        	}
        	else if (anyarray[i] < anyarray[j])
            {
            	temp[k] = anyarray[i];
                i++;
            }
            else
            {
            	temp[k] = anyarray[j];
                j++;
            }
            k++;
           // System.out.println(Arrays.toString(temp));
        }
        

        /*deal with the last elements still left in the first or second part of array*/
        while (i < (end1+1))
        {
        	temp[k] = anyarray[i];
            i++;
            k++;
        }
        while (j < (end2+1))
        {
        	temp[k] = anyarray[j];
            j++;
            k++;
        }
//        System.out.println(Arrays.toString(temp));
        for(int a=begin;a<k;a++)
        {
        	anyarray[a]=temp[a];
        }
       
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
