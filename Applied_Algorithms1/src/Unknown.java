
public class Unknown {

	public static void main(String[] args) {

int A[] ={0,2,4,4};  
int temp=0;
int i=0;
while(i<A.length)
{
	if(A[A[i]] != A[i])
	{
	  temp=A[A[i]];
      A[A[i]]=A[i];
	  A[i]=temp;
	}
	else
	  {				
		  i=i+1;		
	  }	 	   
}
for(i=0;i<A.length;i++)
{
	  if(A[i]!=i)
		{
			System.out.println(i);	
		} 
}
}
}
