import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class DFS {

	public static void main(String[] args) {

		
		int listOfEdges[][] = {{0,1},{1,2},{2,3},{1,3},{7,6},{6,8},{8,9},{9,6},{5,4},{4,3}}; 
		Vector<DFS_Node>  graph =new Vector();
		//System.out.println(listOfEdges.length);
		DFS_Node node[]=new DFS_Node[listOfEdges.length];
		DFS_Node source = null;
		boolean u_ingraph=false;
		boolean v_ingraph=false;
		boolean graph_connected=true;
		int visited[];
		Stack<DFS_Node> S=new Stack();

       for(int i=0;i<listOfEdges.length;i++)
       {
    	   u_ingraph=false;
   		   v_ingraph=false;
    	   DFS_Node node_itr=new DFS_Node();
		   Iterator<DFS_Node> itr= graph.iterator();
		   DFS_Node newNode =new DFS_Node();
    	   newNode.u=listOfEdges[i][0];
    	   newNode.label=listOfEdges[i][0];
    	   DFS_Node v=null;
//		   System.out.println(newNode.label+" start");

           while(itr.hasNext())
           {
        	   node_itr=itr.next();
//    		   System.out.println(node_itr.label+" ");

        	  
        	
        	   if(node_itr.label==listOfEdges[i][0] && node_itr.label!=newNode.u)
        	   {
        		v =node_itr;   
        		v_ingraph=true;
//        		System.out.println("A "+"true");
        	   }
        	   else if((node_itr.label==listOfEdges[i][1])&& node_itr.label!=newNode.u)
        	   {
        		  v =node_itr;
        		  v_ingraph=true;
//        		  System.out.println("B "+"true");
        	   }
        	   else if( node_itr.label==newNode.u)
        	   {
        		   newNode =node_itr;
        		   u_ingraph=true;
//        		   System.out.println("C "+"true");
        	   }
        	   
           }
           
//           System.out.println(u_ingraph+" Uingraph");
    	   if(v==null)
    	   {
    		   v=new DFS_Node();
    		   v.label=listOfEdges[i][1];
    		   v.u=listOfEdges[i][1];
    	   }
    	   newNode.neighbours.add(v);
    	   v.neighbours.add(newNode);
    	   
    	   if(!u_ingraph)
    	   {
    		   graph.add(newNode);
//    		   System.out.println(newNode.label+" U");
    	   }
    	   if(!v_ingraph)
    	   {
    		   graph.add(v);
//    		   System.out.println(newNode.label+ " V");
    	   }
           
       }
		//END FOR
       
       DFS_Node node_graph=new DFS_Node();
	   Iterator<DFS_Node> itr= graph.iterator();
	   
	   while(itr.hasNext())
	   {
		   node_graph=itr.next();
		   System.out.println(node_graph.label + " ");
		   DFS_Node neighbour_node=new DFS_Node();
		   Iterator<DFS_Node> n_itr= node_graph.neighbours.iterator();
		   while(n_itr.hasNext())
		   {
			   neighbour_node=n_itr.next();
			   System.out.println(node_graph.label+"->"+neighbour_node.label);
		   }
	   }
	   
	   
	   //End insertion
	  
	   
	   //DFS
		{
		   visited=new int[graph.size()];
           source=graph.get(5);
           DFS_Node V=new DFS_Node();
           System.out.println("Source->"+source.label+ " NO of Nodes->"+ (graph.size()-1));
	         
	                S.push(source);
	                visited[source.label] = 1;
	                while(!S.empty()) 
	                {
	                	 V = S.pop();
	  	                 for(int i =0; i<V.neighbours.size();i++)
	  	                 {
	  	                	 if (visited[V.neighbours.get(i).label] == 0)
	  	                	 {
	  	                		visited[V.neighbours.get(i).label] = 1;
	                            S.push(V.neighbours.get(i)) ;
	  	                	 }
                                       
	  	                 }
	  	                              
	                }
	              for(int i=0;i<visited.length;i++) 
	              {
	            	  if(visited[i]==0)
	            		  {
		            	  graph_connected=false;
		            	  break;

	            		  }
	              }
	              if(graph_connected)
	              {
            		  System.out.println("THE GRAPH IS CONNECTED");

	              }
	              else
	              {
	            	  System.out.println("THE GRAPH IS  NOT CONNECTED");
	              }
		}
		
	}

	
}



