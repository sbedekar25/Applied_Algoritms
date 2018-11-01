import java.util.Vector;

public class DFS {

	public static void main(String[] args) {

		
		
		int listOfEdges[][] = {{0,1},{1,2},{2,3},{1,3},{7,6},{6,8},{8,9},{9,6},{5,4},{4,3}}; 
		Vector<DFS_Node>  graph =new Vector();

		System.out.println(listOfEdges.length);
//		DFS_Node node[]=new DFS_Node[listOfEdges.length];
		DFS_Node node_u_v=null;
		DFS_Node node_v_u=null;
		for(int i=0;i<listOfEdges.length;i++)
		{

			node_u_v=new DFS_Node();
			node_v_u=new DFS_Node();
			node_u_v.u=listOfEdges[i][0];
			node_u_v.v=listOfEdges[i][1];
			graph.addElement(node_u_v);
			node_v_u.v=listOfEdges[i][0];
			node_v_u.u=listOfEdges[i][1];
			graph.addElement(node_v_u);
			node_u_v=null;
			node_v_u=null;

		}

		
		
	}

	
}
