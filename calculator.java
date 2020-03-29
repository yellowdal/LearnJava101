import java.util.Scanner;
import java.lang.Math;


public class calculator {
    public static void main(String[] args) {
        int a, b, e;
        float c, d;
        double g;
        Scanner db = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nThis is my calculator");
        System.out.println("Press \n1.for addition \n2.for subtraction\n3.for multiplication\n4. for division\n5.for power operation\n6.for logarithmic operation");
        int ch = sc.nextInt();
        switch(ch) {
        case 1:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextInt();
            b = sc.nextInt();
            e = a + b;
            System.out.println("The sum of 2 numbers is" + e);
            break;
        case 2:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextInt();
            b = sc.nextInt();
            e = a - b;
            System.out.println("The difference of 2 numbers is" + e);
            break;
        case 3:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextInt();
            b = sc.nextInt();
            e = a * b;
            System.out.println("The product of 2 numbers is" + e);
            break;
        case 4:
            System.out.println("Enter the two numbers for operation");
            a = sc.nextInt();
            b = sc.nextInt();
            if(a > b) {
                c = a / b;
                System.out.println("The difference of 2 numbers is" + c);
            } else
                System.out.println("\nDivision cannot possible");
            break;
        case 5:
            System.out.println("\nEnter the base");
            a = sc.nextInt();
            System.out.println("\nEnter the exponent");
            b = sc.nextInt();
            int f = a;
            for(int i = 1; i < b; i++)
                f = f * a;
            System.out.println("The power of" + a + "to the exponent" + b + "is" + f);
            break;
        case 6:
            System.out.println("Enter the number for finding it's logarithmic value");
            g = db.nextDouble();
            System.out.println("\nThe logarithmic value is");
            System.out.println(Math.log(g));
            break;
        }



    }

}


