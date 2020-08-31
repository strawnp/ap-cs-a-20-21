import java.util.Scanner;

// classes are written in PascalCase
public class Variables {
    public static void main(String[] args) {
        System.out.println("Let's define some variables...");

        // variables are written in camelCase
        Scanner readIn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNum = readIn.nextInt();
        System.out.println("You entered: " + userNum);

        int num = 42;
        System.out.println(num + " is the answer to Life, The Universe, and Everything");

        double gradePointAverage = 4.53;
        System.out.println(gradePointAverage);

        boolean isHungry = false;
        System.out.println("Hunger: " + isHungry);

        // constants are written in YELL_CASE
        final int TWO_SQUARED = 4;
        System.out.println("2 x 2 = " + TWO_SQUARED);
    }
}
