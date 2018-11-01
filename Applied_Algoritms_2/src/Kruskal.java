import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Kruskal {


    int[] rank, parent;
    int n=0;
    int cost=0;
    int count=0;
    
	public static void main(String[] args) {
		  
		 Kruskal k=new Kruskal();
		    k.n=9;
		    k.parent=new int[k.n];
		   int  edge_list[][]=
			{{0, 1, 4,0},
		     {0, 5, 8,0},
		     {1, 2, 8,0},
		     {1, 5, 11,0},
		     {2, 6, 2,0},
		     {2, 3, 7,0},
		     {2, 8, 4,0},
		     {3, 4, 9,0},
		     {3, 8, 14,0},
		     {4, 8, 10,0},
		     {5, 6, 7,0},
		     {5, 7, 1,0},
		     {6, 7, 6,0},
		     {7, 8, 2,0}};
		
		//kruskals algorithm start
		k.Make_Set();
		Arrays.sort(edge_list, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return Integer.compare(o2[2], o1[2])*-1;
		    }
		});
		k.cost=0;
		
		for(int i=0;i<edge_list.length;i++)
		{
			if(k.Find_Set(edge_list[i][0]) !=k.Find_Set(edge_list[i][1]))
			{
//				Mark/Print u, v as a minimum spanning tree edge
				edge_list[i][3]=1;
				System.out.println(edge_list[i][0]+"->"+edge_list[i][1]);
				k.UnionSet(edge_list[i][0],edge_list[i][1]);
				k.cost += edge_list[i][2];
			}
		
		}
		
		System.out.println(k.cost);
		
		System.out.println("The worst case running time is");
		System.out.println("O(n+E) + O(E Log E)");
		//System.out.println(k.count);
		
		//kruskals algorithm end;
		
	}
	
	public void Make_Set()
    {
        for (int i=0; i<this.n; i++)
        {
            parent[i] = i;
        }
    }
    int Find_Set(int n)
   {    	
    	while( this.parent[n]!= n)
		{
    		n = this.parent[n];
    		//this.count=this.count+1;
    	}
    	return n;
   }
    
  public  void UnionSet(int u, int v)
  {
	  parent[Find_Set(v)] = u;
  }
   

}









//if (parent[n]!=n)
//{
//  parent[n] = Find_Set(parent[n]);
//}
//return parent[n];



//k.rank=new int[k.n];
//public  void UnionSet(int x, int y)
//{
//    int xRoot = Find_Set(x);
//    int yRoot = Find_Set(y);
//    if (xRoot == yRoot)
//        return;
//     if (rank[xRoot] < rank[yRoot])
//        parent[xRoot] = yRoot;
//     else if (rank[yRoot] < rank[xRoot])
//        parent[yRoot] = xRoot;
//
//    else 
//    {
//        parent[yRoot] = xRoot;
//        rank[xRoot] = rank[xRoot] + 1;
//    }
//}