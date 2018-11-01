public class HW_8A {

	public static void main(String[] args) {
		int A[]={1,2,3,4,6,7,22,21,30,89,10,11,12,3,4,5,6,11,15,16,2,3};
		int start=0,end=0,i=0,j=1,max_start=0,max_end=0;
		while(j<A.length)
		{
			if(A[i]<A[j])
			{
				end=j;
				i=i+1;
				j=j+1;
				if((max_end-max_start)<(end-start))
				{
					max_start=start;
					max_end=end;
				}				
			}
			else if(A[i]>A[j])
			{
				if((max_end-max_start)<(end-start))
				{
					max_start=start;
					max_end=end;
				}
				i=i+1;
				j=j+1;
				start=i;
				end=i;			
			}			
		}
		
		for(int k=max_start;k<=max_end;k++)
		{
			System.out.print(A[k]+" ");
		}
	}

}
