import java.util.Arrays;

public class Cormen {

	public static void main(String[] args) {

		int A[]={5,2,4,6,1,3,9,20,-1,30};
		int i=0;
		int key=0;
		for(int j=1;j<A.length;j++)
		{
			i=j-1;
			key=A[j];
			while(i>=0 && A[i]< key)
			{
				A[i+1]=A[i];
				i=i-1;
			}
			A[i+1]=key;
			
		}
		System.out.println(Arrays.toString(A));
		
	}

}
