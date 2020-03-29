import java.util.Scanner;
import java.lang.Math;


public class Calculator {
    public static void main(String[] args) {
        float a, b, e;
        float c, d;
        double g;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nThis is my calculator");
        System.out.println("Press \n1.for addition \n2.for subtraction\n3.for multiplication\n4. for division\n5.for power operation\n6.for logarithmic operation");
        int ch = sc.nextInt();
        switch(ch) {
        case 1:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextFloat();
            b = sc.nextFloat();
            e = a + b;
            System.out.println("The sum of 2 numbers is" + e);
            break;
        case 2:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextFloat();
            b = sc.nextFloat();
            e = a - b;
            System.out.println("The difference of 2 numbers is" + e);
            break;
        case 3:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextFloat();
            b = sc.nextFloat();
            e = a * b;
            System.out.println("The product of 2 numbers is" + e);
            break;
        case 4:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextFloat();
            b = sc.nextFloat();
            if(a > b) {
                c = a / b;
                System.out.println("The difference of 2 numbers is" + c);
            } else
                System.out.println("\nDivision cannot possible");
            break;
        case 5:
            System.out.println("\nEnter the base");
            a = sc.nextFloat();
            System.out.println("\nEnter the exponent");
            b = sc.nextFloat();
            float f = a;
            for(int i = 1; i < b; i++)
                f = f * a;
            System.out.println("The power of" + a + "to the exponent" + b + "is" + f);
            break;
        case 6:
            System.out.println("Enter the number for finding it's logarithmic value");
            g = sc.nextDouble();
            System.out.println("\nThe logarithmic value is");
            System.out.println(Math.log(g));
            break;
        default:
        	System.out.println("Wrong Choice!");
        }
    }
}


