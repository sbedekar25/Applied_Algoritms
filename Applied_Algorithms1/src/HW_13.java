
public class HW_13 {

	
//	Given two set of elements, A with m elements and B with n elements (n ≥ m),
//	devise an algorithm to check if A is a subset of B. Note that you can only compare
//	the elements to tell if they are the same or not. What is the run time of your
//	algorithm in big-O notation?
//	
	
	public static void main(String[] args) { 
		
		int A[]={56,57};
		int B[]={5,6,7,8,9,10,11,5,13,14,15,16,17,18,19,20};
		int i=0,j=0;
		boolean flag=true;
		
		while(i<A.length)
		{
			System.out.println(B[j]);
			if(A[i]==B[j])
			{
				 i=i+1;
				 flag=true;
			}
			else if(A[i]>B[j])
			{
				j=j+1;
			}
			else if(A[i]<B[j])
			{
				flag=false;
				j=A.length;
				break;
 			}
		}
		
		System.out.println(flag);
		
	}

}
