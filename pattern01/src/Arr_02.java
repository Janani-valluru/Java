import java.util.ArrayList;
import java.util.Scanner;

public class Arr_02 {
	//Array list;
	public static void main(String[] args)
	{    
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(10); //10 is initial capacity
		//we use generics(type of data to store and oop
//		list.add(90);
//		list.add(94);
//		list.add(902);
//		list.add(902);
//		list.add(902);
//		list.add(907);
//		list.add(904);
//		
//		
//		
//		System.out.println(list);
//		
//		list.set(0,50);
//		
//		list.remove(2);
//		System.out.println(list);
		
		for(int i =0;i<5;i++) {
			list.add(sc.nextInt());
		}
		//get item at any index
		for(int i =0;i<5;i++) {
			list.add(list.get(i));
		}
		
		
		
		System.out.println(list); 
		
		
		
		
		
		
	}
}
