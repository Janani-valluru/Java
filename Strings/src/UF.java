import java.util.Scanner;
public class UF {

	public static void main(String[] args)
	{
	int N = Scanner.readInput();
	UF uf = new UF();
	while (!StdIn.isEmpty())
	{
	int p = StdIn.readInt();
	int q = StdIn.readInt();
	if (!uf.connected(p, q))
	{
	uf.union(p, q);
	System.out.println(p + " " + q);
	}
}
}