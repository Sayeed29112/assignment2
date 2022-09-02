 import java.util.Scanner;
public class Num4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int s1= (A*B - C*D);
        int s2= (2*A)-B+(3*D);
        int s3=(A*A)+(B*B)-(C*C)+(D*D);
        int s4=(A*A*A)+B-(C*C);
        System.out.println("Solution of Equation-1 = "+s1);
        System.out.println("Solution of Equation-2 = "+s2);
        System.out.println("Solution of Equation-3 = "+s3);
        System.out.println("Solution of Equation-4 = "+s4);
    }
}
