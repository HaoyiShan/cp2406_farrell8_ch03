import java.util.Scanner;

public class NumberDemo2 {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter an integer >> ");
        num1 = kb.nextInt();
        System.out.print("Enter another integer >> ");
        num2 = kb.nextInt();
        displayNumberPlusFive(num1);
        displayTwiceTheNumber(num1);
        displayNumberSquared(num1);
        displayNumberPlusFive(num2);
        displayTwiceTheNumber(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println(n + " times " + FACTOR + " is " + (n +FACTOR));
    }
    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println(n + " plus " + FACTOR + " is " + (n * FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println(n + " squared is " + (n * n));
    }
}
