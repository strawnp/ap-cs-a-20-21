import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);
        System.out.print("Temp in Celsius: ");
        double celsius = readIn.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + " C = " + fahrenheit + " F");
    }
}
