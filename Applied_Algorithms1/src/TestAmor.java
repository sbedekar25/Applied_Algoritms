import java.util.Arrays;

public class TestAmor {

	int max=-1;
	int countersize=0;
	public static void main(String[] args) {
    
		int A []={0,0,0,0};
		
		TestAmor TA=new TestAmor();
		TA.countersize=A.length-1;
	    for(int i=0;i<17;i++)
	    {
	    	TA.increment(A);
         for(int j=(TA.countersize);j>-1;j--){
	       System.out.print(A[j]+ " ");
         }
	       System.out.println();

	    }
	
	    TA.resertcounter(A);
	    System.out.println("Counter reset");
	    for(int j=(TA.countersize);j>-1;j--){
		       System.out.print(A[j]+ " ");
	         }
		
	}
	
	public void increment(int A[])
	{
		int i=0;
		while (i<A.length && A[i]==1)
		{
			A[i]=0;
			i=i+1;
		
		}
		if (i < A.length){
			A[i]=1;
			if(i>this.max)
			{
				this.max=i;
			}
		}
		else
		{
			this.max=-1;
		}
	}
	
	public void resertcounter(int A[])
	{
		System.out.println(this.max);
		for(int i=0;i<=this.max;i++)
		{
			A[i]=0;
		}
		this.max=-1;
	}

}

