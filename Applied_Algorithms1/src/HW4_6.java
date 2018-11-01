
public class HW4_6 {

//	Given two arrays of n integers, the all-pair-sum S is defined as the sum of every
//	pair of elements: S = Σi,aibj, where ai and bj are the integers in the two respective
//	arrays. Given an array of n integers A, we want to find an array of integers B, in
//	which each element bj ∈ {1, -1}, such that the all-pair-sum between A and B is
//	maximized. How to find array B?
//	
	public static void main(String[] args) {

    int A[]={1,7,-7,-1};
    
    int B[]={1,1,1,1};
	int allsum=0;	
	 for(int i=0;i<A.length;i++)
	    {
		 allsum=allsum+A[i];
	    }
	
	
    for(int i=0;i<A.length;i++)
    {
    	for(int j=0;j<B.length;j++)
    	{
    		allsum=allsum+A[i]*B[j];
    	}
    }
		System.out.println(allsum);
	}

}
