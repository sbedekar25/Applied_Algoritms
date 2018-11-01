
public class IntervalTree {

	public static void main(String[] args) {

 int array_low_i[]= {37,24,50,22,30,42,82};
 int array_high_i[]={52,32,72,30,38,62,100};
 
int x=25;
int y=48;
int temp=0;
int overlap=Integer.MIN_VALUE;
int overlapx=0;
int overlapy=0;
//boolean overlapping=false;
boolean overlapping_max=false;
int maxvalue=Integer.MIN_VALUE;
for(int i=0;i<array_low_i.length;i++)
{
 if(array_low_i[i]<=x)
 {
	 temp=Math.max(0, array_high_i[i]-x);
	 if(overlap<temp)
	 {
		 overlap=temp;
		 overlapping_max=true;
		 overlapx=array_low_i[i];
		 overlapy=array_high_i[i];
	 }
 }
 else if(x<=array_low_i[i])
 {
	 temp=Math.max(0, y-array_low_i[i]);
	 if(overlap<temp)
	 {
		 overlap=temp;
		 overlapping_max=true;
		 overlapx=array_low_i[i];
		 overlapy=array_high_i[i];
	 }
 }
	
}
if(overlapping_max)
{
	 System.out.println(overlapx +"  "+overlapy + " " +overlap);
}	
}
}
