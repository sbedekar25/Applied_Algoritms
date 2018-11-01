import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;

class HuffmanNodeComparator implements Comparator<HuffmanNode>{
    @Override
	public int compare(HuffmanNode N1, HuffmanNode N2) {
		
		boolean comparisn_flag= N1.freq > N2.freq;
		int compared = (comparisn_flag) ? 1 : -1;
		return compared;
	}
}
public class Huffman{
	HuffmanNodeComparator comparator = new HuffmanNodeComparator();
	PriorityQueue<HuffmanNode> PQ;
	String huffman_code="";
	public static void main(String[] args) {

		int n = 6;
		Huffman h=new Huffman();
		h.PQ = new PriorityQueue<HuffmanNode>(n,h.comparator);		
		char charcters[] = {'a','b','c','d','e','f'};
        int freq[] = {45,13,12,16,9,5};
        HuffmanNode root= h.HUFFMAN(charcters, freq);
        h.printTree(root,root);
	}	
	public HuffmanNode HUFFMAN(char charcters[], int freq[])
	{		
		for(int i=0; i < charcters.length; i++){
            HuffmanNode node = new HuffmanNode();
            node.freq = freq[i];
            node.symbol = charcters[i];
            this.PQ.offer(node);

        }
		
				for (int i = 1;i<charcters.length;i++)
		   
					{
					 HuffmanNode x = this.PQ.poll();
			         HuffmanNode y = this.PQ.poll();
			         HuffmanNode z = new HuffmanNode();
			         
			            z.left = x;
			            z.left.code="0";
			            z.right = y;
			            x.parent=z;
			            y.parent=z;
			            z.right.code="1";
			            z.freq = x.freq + y.freq;
			            this.PQ.offer(z);
			            System.out.println(z.freq+" "+z.left.freq+" "+z.left.symbol+" " +z.right.freq+" "+z.right.symbol);
					
					
					}
					
				return this.PQ.poll();
	
	}	
	 public void printTree(HuffmanNode root,HuffmanNode treeroot){
	        if(root == null){
	            System.out.println("No code");
	            return;
	        }      
	        Queue<HuffmanNode> queue = new LinkedList<HuffmanNode>();
	        queue.offer(root);

	        System.out.println();
	        while(queue.size() > 0){
	            root = queue.poll();
	           	            
	            if(root.symbol!='0'){
	            	HuffmanNode searchSymbol=new HuffmanNode();
	            	searchSymbol =root;
	            	System.out.print(root.symbol+":");
	            	while(searchSymbol!=null)
	            	{
	            		this.huffman_code=this.huffman_code+searchSymbol.code;
	            		searchSymbol=searchSymbol.parent;
	            	}
	            	StringBuilder code=new StringBuilder();
	            	code=code.append(this.huffman_code);
	            	System.out.println(code.reverse());
	            	code=null;
	            	this.huffman_code="";
	            	
	            }
	            if(root.left != null){
	                queue.add(root.left);
	               
	            }
                if(root.right != null){
	                queue.add(root.right); 
	               
	            }
	        }
	    }

	
	
}
