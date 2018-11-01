import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HW4_Q8 {

	public static void main(String[] args) {
		int sum=0;
		int array[]={17, 14, 19, 15, 7, 5, 12, 6, 10, 16, 9, 1, 11, 0, 3, 18, 13, 2, 4, 8};	
		int N=78;
		int len=array.length;
		int j=0;
		int start_elem=0;
		while(j<len)
		{
			sum=sum+array[j];
			if(sum<N)
			{
				j=j+1;
				
			}
			else if(sum==N)
			{
				break;
			}
			else if(sum>N)
			{
				while(sum>N)
				{
					sum=sum-array[start_elem];
					start_elem=start_elem+1;
					if(sum<N)j=j+1;
				}
				
			}
		}
		if(sum==N)
		{
			System.out.println(start_elem+" "+j);
		}
		else
		{
			System.out.println("Not possible");
		}
		
		

	}

}//		List<Integer> range = IntStream.range(0, 20).boxed()
//.collect(Collectors.toCollection(ArrayList::new));
//Collections.shuffle(range);
//range.subList(0, 20).forEach(System.out::println);
//
//
//int[] array = range.stream().mapToInt(i->i).toArray();				
//System.out.println(Arrays.toString(array));

//int array[]={27, 71, 18, 93, 
//64, 2, 72, 15, 4, 58, 
//55, 81, 53, 23, 95, 83, 
//6, 79, 26, 70, 29, 91, 38, 
//85, 40, 35, 17, 63, 75, 45, 84,
//59, 57, 39, 50, 56, 31, 96, 13, 28,
//44, 9, 11, 14, 66, 89, 46, 49, 24, 7, 34, 
//43, 99, 1, 41, 60, 98, 10, 12, 42, 67, 65, 78, 16, 90, 51, 37, 68, 61, 36, 77, 94, 87, 97, 8, 69, 25, 52, 5, 88, 86, 76, 62, 3, 80, 21, 20, 30, 0, 22, 54, 48, 73, 74, 19, 92, 47, 33, 32, 82};

