
public class FloyldWarshall {

	String intermediate[][];
	public static void main(String[] args) {
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
//			Floyd_Warshall(G)

		int V=5;
		int E=listOfEdges.length;
		int D[][]=new int[V][V];
		FloyldWarshall FW=new FloyldWarshall();
		FW.intermediate=new String[V][V];
		
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<V;j++)
			{
				D[i][j]=Integer.MAX_VALUE;
				FW.intermediate[i][j]=null;
			}
		}
	
		for(int i=0;i<V;i++)
		{
			D[i][i] = 0;
		}
			
//		
		for(int i=0;i<E;i++)
		{
			D[listOfEdges[i][0]][listOfEdges[i][1]] = listOfEdges[i][2];
					FW.intermediate[listOfEdges[i][0]][listOfEdges[i][1]]= String.valueOf(listOfEdges[i][1]);
		}
			
			
		for(int k=0;k<V;k++)
		{
			for(int i=0;i<V;i++)
			{
				for(int j=0;j<V;j++)
				{
					if( D[i][j] > D[i][k] + D[k][j] )
					{
						D[i][j] = D[i][k] + D[k][j]  ;   
						FW.intermediate[i][j] = String.valueOf(k);
					}
							
				}
			}
		}
		
		for(int i=0;i<V;i++)
		{
			
			for(int j=0;j<V;j++)
			{
				System.out.println("Path from "+i+" to "+j);
				FW.PrintPath( i,j);
			}
		}
		
	}
	
	public void PrintPath(int u, int v)
	{
		if( this.intermediate[u][v] == null)
			return;
			
		if( this.intermediate[u][v].equalsIgnoreCase(String.valueOf(v)))
		{
			System.out.print(v+" ");
			return;
		}
			
		int temp=Integer.parseInt(intermediate[u][v]);
		
		PrintPath(u, temp);
		PrintPath(temp, v);
	}

}
