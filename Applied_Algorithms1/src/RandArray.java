import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandArray {

	public static void main(String[] args) {

   int A[]={10,20,30,40,50,60,70,80,90,100};
   int size=A.length;
   int randpos[]=new int[size]   ; 
   int new_A[]=new int[size]   ; 
   for(int j=0;j<size;j++)
   {
	   randpos[j]=1;
   }
	System.out.println(Arrays.toString(A));
   int count=0;
   for(int i=0;i<size;i++){
	   while(true)
	   {
	        int k = (int)Math.floor(Math.random() * (size - 0));
             if(randpos[k]==1)
             {
            	 new_A[k]=A[i];
               randpos[k]=-1;
               count++;
               break;
              }
             
             if(count==size){break;}
       }
    }
	System.out.println(Arrays.toString(new_A));
	}

}
