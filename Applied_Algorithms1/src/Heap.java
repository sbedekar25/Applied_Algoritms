import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Heap {
int heapsize=0;
int size=0;
private static Scanner sc;
	public static void main(String[] args) {
  int arrayElements[];
  
    Random rand = new Random(System.currentTimeMillis());
	 sc = new Scanner(System.in);
	 Heap hh =new Heap();
	 
	int r = 0;
	System.out.println("Enter the size of array");
   int N=sc.nextInt();
   hh.heapsize=N;
   hh.size=N;
   arrayElements =new int[N];
   for(int i=0;i<N;i++)
	{
		r=rand.nextInt();
		r = r % (3*N) ; 
		arrayElements[i] =r;
	}
	System.out.println(Arrays.toString(arrayElements));
	System.out.println("____________________________________________________________________");
	System.out.println("______________________________After______________________________");
	System.out.println("____________________________________________________________________");
	System.out.println("______________________________Sorting_________________________________");
	System.out.println("____________________________________________________________________");
	System.out.println("____________________________Thre Array__________________________________");
	System.out.println("____________________________________________________________________");
   hh.Heap_sort(arrayElements);
   
	System.out.println(Arrays.toString(arrayElements));

	}
	
	
	
	
	public void Heap_sort(int A[]) // input array A
		{
		 build_max_heap(A); // make A into a max heap, so A[0] is the maximum of the HEAP elements
		 
		 for (int i= A.length-1 ;i> 0; i--)
		 {
			 int temp = 0;
				temp=A[0];
				A[0]=A[i];
				A[i]=temp;
				// put the maximum at the end of the heap			   
				this.heapsize = this.heapsize - 1; // remove the last element from the heap(still on the array)
			  float_down(A,0); // adjust the heap to restore heap property
		 }
		}
	public int parent(int i){
		 return (i-1)/2 ;// returns only the integer part of the value
		}
		
	public int left(int i){         //i is the node index in the array
	    return 2*i+1;  // returns the index of the left child of node i
	}
	public int right(int i){
	    return 2*i+2;  // returns the index of the right child of node i
	}
	
	public void float_down(int A[],int i)// push node i downwards the binary heap if it violates the heap property. 
	{ 
	 // Note the precondition of this function is that the left and right subtrees of node i already satisfy the heap property 
	 // That is node i is the only node that possibly violates the heap property currently
	 // So we need to push node i downward of the heap to restore the heap property
	 int l = left(i);
	 int r = right(i);
	 int max =i;
//	 System.out.println(l+" " +r+" "+i);
	
	 if(l<this.heapsize){ if(A[l]>A[max])max=l;}	 
	 if(r<this.heapsize){ if(A[r]>A[max])max=r;}	 
	  //the index of the node that has the maximum value among node l,r,i

	 if(max != i){ // if the parent node is not bigger than the child nodes
	               // which violates the max-heap property
	   // swap(heap[i],heap[max]) // correct the violation by swapping the bigger node to the parent position
	   int temp=0;
		temp=A[i];
		A[i]=A[max];
		A[max]=temp;
		 float_down(A,max); // check recursively if the heap property is valid in the subtree
	 }
	 }
	public void build_max_heap(int A[])
	{
		
	
		 this.heapsize = A.length;
		 for (int i = parent(this.heapsize-1);i>=0;i--) //starting from the second last level of the heap tree up to the root
		 {                         //the bottom-up order is crucial here 
		  
			 float_down(A,i); // make sure every node satisfy the heap property
		                   // in the end, the array is adjusted to be a heap
		 }	
	}

}
