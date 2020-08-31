import java.util.Scanner;

public class MathOps {

    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = readIn.nextInt();
        System.out.print("Enter another number: ");
        int num2 = readIn.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
