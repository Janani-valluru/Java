import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name:\n");
        String name = scanner.nextLine(); // nextline is for string//

        System.out.println("enter your age:\n");
        int age = scanner.nextInt();

        System.out.println("hello\n" + name);
        System.out.println("your age\n" + age);

    }
}