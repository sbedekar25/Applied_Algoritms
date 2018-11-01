
public class Longestsubsequence {
	private static final String MATCH_CASE = null;
	private static final String DECREASE_FIRST_STRING = null;
	private static final String DECREASE_SECOND_STRING = null;
	int CACHE[][] ;
	String s1="ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
	String s2="GTCGTTCGGAATGCCGTTGCTCTGTAAA";
	String Direction[][];
	public static void main(String[] args) {
   
		Longestsubsequence LS=new Longestsubsequence();
		
	}
	public void  PrintPath(int p, int q)
	{	
		if (Direction[p][q] == MATCH_CASE)	
		{
			this.PrintPath(p-1, q-1);
			System.out.println(this.s1.charAt(p)); 
		}
			else if  (this.Direction[p][q] == DECREASE_FIRST_STRING)
			{
			PrintPath(p-1, q);
			}
			else if  (this.Direction[p][q] == DECREASE_SECOND_STRING)
			{	
			PrintPath(p, q-1);
			}
	}
	public int  LCS(int p, int q)
	{
		if( p==-1 || q ==-1	)// base case
			return 0;

		if (this.s1.charAt(p)==this.s2.charAt(q))	// match case
			return 1 + LCS(p-1, q-1);		
		
		else				
			return Math.max( LCS(p-1, q), LCS(p, q-1) );
	}
	public int  LCS1(int p, int q)
	{
		if(p==-1 || q ==-1)	// base case
			return 0;
			
		if (this.CACHE[p][q]!= -1 )//
			return this.CACHE[p][q];
			
		if(this.s1.charAt(p)==this.s2.charAt(q)) // match case
		{
			Direction[p][q] = MATCH_CASE;
			return CACHE[p][q] = 1 + LCS(p-1, q-1);	
		}
		else				
		{
			int v1 = this.LCS(p-1, q);
			int v2 = this.LCS(p, q-1);
			
			if (v1 > v2)	
				{this.Direction[p][q] = DECREASE_FIRST_STRING;
				this.CACHE[p][q] = v1;} 
			else		
				{
				this.Direction[p][q] = DECREASE_SECOND_STRING;
				this.CACHE[p][q] = v2;
				
			    return CACHE[p][q];
				}
			return q;
		}
		
	}


}
