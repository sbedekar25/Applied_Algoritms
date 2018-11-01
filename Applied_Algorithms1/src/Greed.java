import java.util.Vector;

public class Greed {

	public static void main(String[] args) {

		
		int Dist[]={10,20,25,20,56};
		
		int i=0;
	    int d=30;
	    Vector Solution=new Vector();
	    int destination=0;
	    boolean flag=true;
		int distance_to_travel = 0;
				while ((i+1)!=Dist.length-1) {
				distance_to_travel = Dist [i];
				if((distance_to_travel+ Dist [i])>=d)
				{
					flag=false;
				}
				while ((distance_to_travel <=d) && ((i+2)<Dist.length)&&flag) {
				distance_to_travel = distance_to_travel + Dist [i+1];
				i =i + 1;
				System.out.println(i +" "+distance_to_travel);
				}
				
				if(!flag)
				{
					distance_to_travel=0;
					i=i+1;
					Solution.addElement(String.valueOf(distance_to_travel));
				}
				
				System.out.println(Solution);
				}
				
	}

}
