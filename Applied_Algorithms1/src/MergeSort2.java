import java.util.Arrays;
import java.util.Scanner;

public class MergeSort2 {
   boolean haszero =false;
	public static void main(String[] args) {
		//Input
		 Scanner sc=new Scanner(System.in);
		
		  MergeSort2 MS = new MergeSort2();
		  int arrayElements[] ={1,3,1,6,1,5,9,8,-20,4,10,0,23,-1,-1,0,5,5,5,5};
		  int arraySize=arrayElements.length;
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
		        
	}
	
	public  void Merge(int anyarray[], int begin, int mid, int end)
	{
      
        int  begin1 = begin;
        int  end1   = mid;
        int begin2 = mid +1;
        int end2   = end;
        int temp[]=new int[anyarray.length];  
        int i = begin1, j = begin2;
        int k = begin1;
        while (i <= end1 && j <= end2)
        {
            
        	if(anyarray[i]==anyarray[j])
        	{
        		anyarray[j] = anyarray[end2];
        		anyarray[end2]=0;
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
        }      
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
