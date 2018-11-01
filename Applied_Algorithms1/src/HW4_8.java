
public class HW4_8 {

	public static void main(String[] args) {


		int A[]={21,30,89,10,11,12,  3,4,5,6,11,15,2};
		int x=0,y=0,i=0,j=1;
		while(j<A.length)
		{
			System.out.println(i+" "+j+" "+A.length);
			if(j==A.length-1)
			{
				if(A[i]<A[j]){
				x=i;
				y=j;
				j=j+1;
				i=i+1;		
				}
				else
				{
					j=j+1;
					i=i+1;
				}
						
			}
		    else if(A[i]<A[j]&&j!=A.length-1)
			{			
				j=j+1;	
				i=i+1;
			}
			else if(A[i]>A[j] && (j<A.length-1))
			{			
				if((y-x)<(j-i-1))
				{
				x=i;
				y=j-1;
				}
				i=i+1;
				j=j+1;
			}
			
		}
		
		System.out.println(x+" "+y);
	}

}
