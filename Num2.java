import java.util.Scanner;
public class Num2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int r;
        double area, pi = 3.1416;
        System.out.print("Enter the value of redius of the circle : ");
        r=input.nextInt();
        area=pi*Math.pow(r,2);
        System.out.println("Area of circle : "+area);
    }
}
