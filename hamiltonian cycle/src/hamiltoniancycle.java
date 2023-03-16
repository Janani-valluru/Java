import java.util.Scanner;

public class hamiltoniancycle {
	
	private int adj[][] , x[],n;
	public hamiltoniancycle()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("enter no of nodes0");
		
		n = sobj.nextInt();
		x = new int[n];
		x[0]=0;
		
		for(int i=0;i<n ; i++)
			x[i]= -1;
		adj = new int [n][n];
		System.out.println("enter matrix");
	
		for(int i=0;i<=n;i++)
		{
			for(int j =0 ; j<=n;j++)
			{
				adj[i][j]=sobj.nextInt();
				
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
