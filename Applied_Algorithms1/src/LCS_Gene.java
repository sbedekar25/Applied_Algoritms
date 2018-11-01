
public class LCS_Gene {

	
	int CACHE[][];
	int  Direction[][];
	String s1="ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
	String s2="GTCGTTCGGAATGCCGTTGCTCTGTAAA";
	int MATCH_CASE =0;
	int DECREASE_FIRST_STRING=1;
	int DECREASE_SECOND_STRING=2;
	int lcs_length=0;
    
	public LCS_Gene()
	{
		
		this.CACHE=new int[this.s1.length()][this.s2.length()];
		this.Direction=new int[this.s1.length()][this.s2.length()];
		for(int i=0;i<this.s1.length();i++)
		{
			for(int j=0;j<this.s2.length();j++)
			{
				this.CACHE[i][j]=-1;
				this.Direction[i][j]=-1;
			}
		}
	}
	
	public static void main(String[] args) {
		LCS_Gene LG= new LCS_Gene();
		LG.LCS(LG.s1.length()-1, LG.s2.length()-1);
		LG.PrintPath(LG.s1.length()-1, LG.s2.length()-1);
		System.out.println();
		System.out.println(LG.lcs_length);
		 
	}
	public int LCS(int p,int  q)
	{
		if (p==-1 || q ==-1)	// base case
			{return 0;}
			
		if (this.CACHE[p][q] != -1) // this subproblem is already solved, return the cached value from here
			{return this.CACHE[p][q];}
			
		if (s1.charAt(p) == s2.charAt(q))	// match case
			{
			this.Direction[p][q] =this.MATCH_CASE;
			return this.CACHE[p][q] = 1 + LCS(p-1, q-1);
			}		
		
		else				
			{
			int v1 = LCS(p-1, q);
			int v2 = LCS(p, q-1);
					
			if (v1 > v2)	// decrease s1 case
				{
				  Direction[p][q] =this.DECREASE_FIRST_STRING ;
				  CACHE[p][q] = v1;
				}
			else		// decrease s2 case
				{
				Direction[p][q] =this.DECREASE_SECOND_STRING ;
				CACHE[p][q] = v2;
				}		
			return CACHE[p][q];

			}
	}
	public void PrintPath(int p, int q)
	{
		if(p==-1||q==-1)return;
		
		if (Direction[p][q] == MATCH_CASE)	
          { 
			PrintPath(p-1, q-1);
			System.out.print(s1.charAt(p));// or print(s2[q]) they are same
			this.lcs_length=this.lcs_length+1;
          }
		
		else if (Direction[p][q] == this.DECREASE_FIRST_STRING)
			
			{
			PrintPath(p-1, q);
			}

		else if( Direction[p][q] == this.DECREASE_SECOND_STRING)
				
			{
			PrintPath(p, q-1);
			}
		
	}

}
