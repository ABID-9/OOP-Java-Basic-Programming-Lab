import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First Number: ");
        int a = sc.nextInt();

        System.out.print("Second Number: ");
        int b = sc.nextInt();

        System.out.println(a + " x " + b + " = " + (a * b));
    }
}