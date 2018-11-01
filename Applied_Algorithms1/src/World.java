import java.util.Arrays;

public class World {

	public static void main(String[] args) {

		double p=0.50;
		int n=13;
		int Awin=n-1;
		int Bwin=n-3;
		double P[][]=new double [n/2+1][n/2+1];
		double q = 1 - p;
		    for (int j = 1;j<=Math.ceil(n/2) ;j++){
		        P[0][j] = 0;
		    }
		    for( int i = 1;i<=Math.ceil(n/2);i++){
		        P[i][0]= 1;
		        for (int j=1;j<= Math.ceil(n/2);j++)
		        {
		        	P[i][j] = p * P[i-1][j] + q * P[i][j-1];
		        }
		    }
		   System.out.println( P[(n/2)][(n/2)]);
		System.out.println(Arrays.toString(P[0]));
		System.out.println(Arrays.toString(P[1]));
		System.out.println(Arrays.toString(P[2]));
		System.out.println(Arrays.toString(P[3]));
		System.out.println(Arrays.toString(P[4]));
		System.out.println(Arrays.toString(P[5]));
		System.out.println(Arrays.toString(P[6]));		
		
		
	}

}
