import java.util.Scanner;
public class dijkstra {
	
	int n ,src;
	int a[][] = new int[10][10];
	void read_cost_adjacency_matrix()
	{
		    System.out.println("********* DIJKSTRA'S ALGORITHM *********");
		    System.out.println("Enter no. of nodes :");
		    Scanner sobj=new Scanner (System.in);
		    n=sobj.nextInt();
		    System.out.println("Enter cost adjacency matrix :");
		    for(int i=1;i<=n;i++)
		   {
			for(int j=1;j<=n;j++)
			{
				a[i][j]=sobj.nextInt();
			}
		   }
			System.out.println("Enter source vertex :");
			src=sobj.nextInt();
			sobj.close();
	}
	
	public int find_min_dis(int d[] ,int visited[])
	{
		int min_dis = 999;
		int min_disvertex = -1;
		
		for(int i=1;i<=n;i++)
		{
			if(visited[i] == 0 && d[i]<min_dis)
			{
				min_dis = d[i];
				min_disvertex = i;
			}
		}
		return min_disvertex;
	}
	
	public void Dijstra()
	{
		int[] visited = new int [10];
		int[] d = new int[10];
		
		for(int i=1;i<=n;i++)
		{
			visited[i] =0;
			d[i] =999;
		}
		d[src]=0;
		
		for(int i=1;i<=n ;i++) {
			
			int u = find_min_dis(d,visited);
			visited[u]=1;
			
			for(int v =1;v<=n ;v++)
			{
				if (visited[v] ==0 && (d[u] + a[u][v])<d[v])
				{
					d[v]=d[u]+a[u][v];
				}
			}
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("distance "+src+"to vertex " +i+"is:"+d[i]);
		}
	}

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		dijkstra t = new dijkstra();
		t.read_cost_adjacency_matrix();
		t.Dijstra();
	}

}
