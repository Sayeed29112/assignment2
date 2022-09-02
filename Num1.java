 import java.util.Scanner;
public class Num1 {
    public static void main(String ags[]) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the 1st number: ");
        num1 = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("Sum = " + sum);

    }
}
