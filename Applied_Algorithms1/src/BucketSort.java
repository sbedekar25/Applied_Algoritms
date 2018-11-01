import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BucketSort {

	Node node[];
	private static Scanner sc;
	public static void main(String[] args) {

		double arrayElements[];
		sc = new Scanner(System.in); 
		BucketSort BS =new BucketSort();
	    Random rand = new Random(System.currentTimeMillis());
		double r = 0;
		System.out.println("Enter the size of array");
	    int N=sc.nextInt();
	    String str ="#0.";
	    int index=0;
	    for(int l=0;l<String.valueOf(N).length()-1;l++)
	    {	
	     str=str.concat("0");	
	    }
	    DecimalFormat dec = new DecimalFormat(str);

	    arrayElements =new double[N];
	    for(int i=0;i<N;i++)
		{
			r=rand.nextDouble();
			
			arrayElements[i] =Double.parseDouble(dec.format(r));
		}
		BS.node=new Node[N];
		for (int j =0;j<N;j++)
		{
		BS.node[j]	=null;
		
		}
		System.out.println(Arrays.toString(arrayElements));    
		for(int k=0;k<N;k++){
		index=0;
		index=(int)(arrayElements[k]*N);
		if(index>=N){index=N-1;}
		BS.insert(arrayElements[k], index, BS.node[index]);
		
		}
		System.out.println("");

		System.out.println("Output");
		for(int a=0;a<N;a++)
		{
			Node n=BS.node[a];
			while(n!=null)
			{
				System.out.print(n.data +" " );
				n=n.next;	
			}
			
		}
		
//System.out.println(Arrays.toString(arrayElements));    
	}
	public void insert(double value, int index, Node n)
	{
		// This function insert a new node with value into the B[index] linked list. The function
		// inserts the new node in the correct place of the linked list so that the link list is sorted
		if (n == null)
		{
//			// No elements in the linked list, create and insert the node at the beginning of the list
//			t = (node *)malloc(sizeof(node));
//			t->d = value;
//			t->next = NULL;
//			B[index] = t;
			this.node[index]= new Node();
			this.node[index].data=value;
			
			
		}
		else
		{
			// Take two pointers p0 and p1. p0 always stays one node behind p1
			// The new node t will be inserted either on the end of the linked list
			// or before a node that has a value greater than the new node value.

			Node p0, p1,nextNode;
			p0 = n;
			nextNode = p0.next;
			p1= new Node();
            
			if (p0.data > value)
			{
//				t = (node *)malloc(sizeof(node));
//				t->d = value;
//				t->next = p0;
//				B[index] = t;
				double temp =p0.data;
				
				
				n=p1;
				n.next=p0;
				n.data=value;
				n.next.data=temp;
				n.next.previous=this.node[index];
			}
			
			
			else if(n.next==null &&p0.data < value )
			{
			 	Node newNode =new Node();
				n.next =newNode;
				newNode.previous=this.node[index];
				newNode.next=null;
				newNode.data=value;
			}
			else
			{
				while (nextNode != null)
				{
					if (nextNode.data > value)
					{
						break;
					}
				// Advance both node pointer one node ahead to compare with next element in the linked list
					nextNode = nextNode.next;
					p0 = p0.next;
				}
			// Create new node t and insert at the appropriate place
				Node t =new Node();
				t.data=value;
				t.next = nextNode;
				p0.next = t;
			}
		}
	}
}
