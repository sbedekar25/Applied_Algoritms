import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Vector;

class DijkstraComparator implements Comparator<Dijkstra_Node>{
    @Override
	public int compare(Dijkstra_Node N1, Dijkstra_Node N2) {
		
		boolean comparisn_flag= N1.weight > N2.weight;
		int compared = (comparisn_flag) ? 1 : -1;
		return compared;
	}
}
public class Dijkstra {
	DijkstraComparator comparator = new DijkstraComparator();
	PriorityQueue<Dijkstra_Node> PQ;
	public static void main(String[] args) {
		boolean u_ingraph=false;
		boolean v_ingraph=false;
	
		Dijkstra D=new Dijkstra();
		
 int  listOfEdges[][]=
		{{0, 1, 10},
		{0, 3, 5},
		{1, 2, 1},
		{1, 3, 2},
		{2, 4, 4},
		{3, 1, 3},
		{3, 2, 9},
		{3, 4, 2},
		{4, 0, 7},
		{4, 2, 6},
		};
    int DISTANCE[]=new int[5];
    
    
	Vector<Dijkstra_Node>  graph =new Vector();
	

    for(int i=0;i<listOfEdges.length;i++)
    {
 	       u_ingraph=false;
		   v_ingraph=false;
		   Dijkstra_Node node_itr=new Dijkstra_Node();
		   Iterator<Dijkstra_Node> itr= graph.iterator();
		   Dijkstra_Node newNode =new Dijkstra_Node();
 	       newNode.u=listOfEdges[i][0];
 	       newNode.label=listOfEdges[i][0];
 	       Dijkstra_Node v=null;

        while(itr.hasNext())
        {
     	   node_itr=itr.next();
     	  
     	    if( node_itr.label==newNode.u)
     	   {
     		   newNode =node_itr;
     		   u_ingraph=true;
     	   }
     	   
        }
        
 		   v=new Dijkstra_Node();
 		   v.label=listOfEdges[i][1];
 		   v.u=listOfEdges[i][0];
 		   v.weight=listOfEdges[i][2];
 	   
 	   newNode.neighbours.add(v); 	   
 	   if(!u_ingraph)
 	   {
 		   graph.add(newNode);
 	   }     
    }
    
       Dijkstra_Node node_graph=new Dijkstra_Node();
	   Iterator<Dijkstra_Node> itr= graph.iterator();
	   
	   while(itr.hasNext())
	   {
		   node_graph=itr.next();
		   System.out.println(node_graph.label + " ");
		   Dijkstra_Node neighbour_node=new Dijkstra_Node();
		   Iterator<Dijkstra_Node> n_itr= node_graph.neighbours.iterator();
		   while(n_itr.hasNext())
		   {
			   neighbour_node=n_itr.next();
			   System.out.println(node_graph.label+"->"+neighbour_node.label+" with weight "+neighbour_node.weight);
		   }
	   }
	   
	   
	   //End insertion
	 
	   
	   //start djikstra
	 		for(int i=0;i<5;i++)
	 		{
	 			DISTANCE[i]=Integer.MAX_VALUE;
	 		}
	 		D.PQ = new PriorityQueue<Dijkstra_Node>(5,D.comparator);	
	 		
	 		Dijkstra_Node source = graph.get(0);
	 		System.out.println(source.label); 		
	 		D.PQ.offer(source); 
	 		DISTANCE[source.label]=0;	 		
	 		while(!D.PQ.isEmpty())
	 		{
	 			Dijkstra_Node node=new Dijkstra_Node();
	 			
	 			node = D.PQ.poll();
	 			Dijkstra_Node node_neighbour=new Dijkstra_Node();
	 		    Iterator<Dijkstra_Node> d_itr= node.neighbours.iterator();
	 		   while(d_itr.hasNext())
	 		   {
	 			  node_neighbour=d_itr.next(); 
	 			  
	 				if( DISTANCE[node_neighbour.label] > DISTANCE[node.label] + node_neighbour.weight)
	 					{
	 					DISTANCE[node_neighbour.label] = DISTANCE[node.label] + node_neighbour.weight;
	 				
	 					Iterator<Dijkstra_Node> itr1= graph.iterator();
	 				    Dijkstra_Node node_match;
	 				    while(itr1.hasNext())
	 		            {
	 		     	      node_match=itr1.next();
	 				      if(node_match.label==node_neighbour.label)
	 				       {
	 					     D.PQ.offer(node_match);
	 					     break;
	 				       }
	 					 
	 				    }
	            }
	 				
	 		   }
	 		 			
	 		}
	 			
	 			
	   //end dijkstra
	 System.out.println(Arrays.toString(DISTANCE));
	}

}
