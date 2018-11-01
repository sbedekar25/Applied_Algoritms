public class Rod_Cutting
{
	 double Mem[];
	 double cost[];
	 int solution[];
	    public  double cutRod(double price_list[],int n)
	    {
	        
	        Mem[0] = 0; 
//	        cost[0]=0;
	        for (int i = 1; i<n; i++)
	        {
	            double m = Double.MIN_VALUE;
	            for (int j = 1; j <=i; j++)
	            { 
//	            	cost[i-j-1]=(i-j-1);
	            	m = Math.max(m, price_list[j] + Mem[i-j]);
	            	
	            	solution[i]=j;
	            	System.out.println(solution[i] +" "+i);
	            } 
	            Mem[i] = m;
	        }
	        int nn=n;
//	        while( nn > 1)
//            {
//	        	System.out.println(solution[nn] +" "+nn);
//	        	nn =nn - solution[nn];
//	        	
//	        	
//            }

	 
	        return Mem[n];
	    }
    		      
    
    
    public static void main(String args[])
    {
        double price_list[] = {3  ,4.5 , 8  , 9 , 10  , 17 , 17  ,20};
        //                     1    2    3    4    5     6    7    8
        int n = price_list.length;
        Rod_Cutting rc=new Rod_Cutting();
        rc.Mem = new double[n+1];
        rc.cost = new double[n+1];
        rc.solution = new int[n+1];
        System.out.println("Maximum Obtainable Value is "+rc.cutRod(price_list, n+1));
 
    }
}