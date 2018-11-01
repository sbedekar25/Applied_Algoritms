public class Rod_Cutting_Cuts
{
	 double Mem[];
	 int solution[];
	    public  double cutRod(double price_list[],int n)
	    {       
	        Mem[0] = 0; 
	        int c=0;
	        for (int j = 1; j<n; j++)
	        {
	            double m = Double.MIN_VALUE;
	            for (int i = 1; i <=j; i++)
	            { 
//	            	m = Math.max(m, price_list[j-i+1] + Mem[j-i]);
	            	if(i==j)c=0;
	            	else c=1;
	            	if(m < (price_list[i]+Mem[j-i] -c))
	            	{
	            		m=price_list[i]+Mem[j-i]-c;
		            	solution[j]=i;
	            	}	            
	            } 
	            Mem[j] = m;
	        }
	        int nn=n-1;
	        while( nn >= 1)
            {
	        	System.out.print(solution[nn] +" ");
	        	nn =nn - solution[nn];    	
            }
	        return Mem[n-1];
	    }		      
    public static void main(String args[])
    {
        double price_list[] = {0, 3  ,4.5 , 8  , 9 , 10  , 17 , 17  ,20};
        //                     0, 1    2    3    4    5     6    7    8
        int n = price_list.length;
        Rod_Cutting_Cuts rc=new Rod_Cutting_Cuts();
        rc.Mem = new double[n];
        rc.solution = new int[n];
        System.out.println("Maximum Obtainable Value is "+rc.cutRod(price_list, n));
 
    }
}