
public class Recur {

	public static void main(String[] args) {


		int N=4;
		Recur r=new Recur();
		r.rec(N);

	}

	public void rec(int n)
	{
		System.out.println("Hello");
		
		if(n>1)
		{	
		rec(n/2);
		rec(n/2);
		rec(n/2);
		rec(n/2);
		}

	}
}
