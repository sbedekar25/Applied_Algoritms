import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinaryTree {
	private static Scanner sc;
	 Node_BT root=null;
	 int level=0;
	public static void main(String[] args) {
       
		int arrayElements[];
		sc = new Scanner(System.in); 
		BinaryTree bt=new BinaryTree();
		Random rand = new Random(System.currentTimeMillis());
		int  r = 0;
		System.out.println("Enter the size of array");
	    int N=sc.nextInt();
	    arrayElements=new int[N];
	    for(int i=0;i<N;i++)
		{
			r=rand.nextInt(N);			
			arrayElements[i] =r;
		}
	    System.out.println(Arrays.toString(arrayElements));
	    Node_BT node=new Node_BT();
	    for(int i=0;i<N;i++)
		{	
	    	bt.level=0;
	    	bt.insert(bt.root,arrayElements[i]);	
		}
	    
	    bt.inOrder(bt.root);

	}
	
	public Node_BT TREE_SEARCH(Node_BT p, int value)
	  {
		if ( p == null )
		return null;
	  if (value == p.value)
		{
		  return p;
		}
	  if( value < p.value)
		return TREE_SEARCH(p.left, value);
	  else
		return TREE_SEARCH(p.right, value);
	  }
	
	public void inOrder(Node_BT node)
		{if (node ==null)
			return;
		else
		{
			this.inOrder(node.left) ;
			System.out.println(node.value);
			this.inOrder(node.right);
		}
		}

	public void insert(Node_BT node ,int value)
	{
		if(this.root==null)
		{
			this.root=new Node_BT();
			this.root.value=value;
			this.root.left=null;
			this.root.right=null;
//			System.out.println("Root:"+value+"  level:"+this.level);

			
		}
		else 
		{
			if(node.left == null && node.value>value){
			 node.left=new Node_BT();
			 node.left.value=value;
			 node.left.left=null;
			 node.left.right=null;
			 this.level=this.level+1;
//			 System.out.println("L"+value+" level:"+this.level);
			 return;
			}
			else if(node.right == null && node.value<=value){
				 node.right=new Node_BT();
				 node.right.value=value;
				 node.right.left=null;
				 node.right.right=null;
				 this.level=this.level+1;
//				 System.out.println("R"+value+" level:"+this.level);

				 return;
			}
			else if(node.left!=null && node.value>value){
				 this.level=this.level+1;
			this.insert(node.left, value);	
			}
			else if(node.right!=null && node.value<=value){
				 this.level=this.level+1;
            	this.insert(node.right, value);
			}
		}
			

		

	}
}
