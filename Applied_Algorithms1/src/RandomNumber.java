import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {


		
		//srand(time(NULL));    // should only be called once
		
		Random rand = new Random(System.currentTimeMillis());
		int M=100;
		int K=10;
		int r = Math.abs(rand.nextInt()) ;   // returns a pseudo-random integer between 0 and RAND_MAX
		r = r % M  ;      // Mod r y M so that r is a uniformly distributed random integer btetween 0 and M-1, both ends included 
		r = r + K; // r is uniformly distributed integer between K and M-1+K
		System.out.println(r);
		
	}

}
