import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        int sum, sub, mul, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        System.out.println("enter a value for a:");
        int a = sc.nextInt();
        System.out.println("enter a value for b:");
        int b = sc.nextInt();
        System.out.println("output");

        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        System.out.println("the sum:" + sum);
        System.out.println("the mul:" + mul);
        System.out.println("the sub:" + sub);
        System.out.println("the div:" + div);

    }

}
