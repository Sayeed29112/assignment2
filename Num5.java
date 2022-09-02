import java.util.Scanner;
public class Num5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A = ");
        int A = input.nextInt();
        System.out.println("Enter B = ");
        int B = input.nextInt();
        System.out.println("Enter C = ");
        int C = input.nextInt();
        if(A>B && A>C){
            System.out.println("Maximum Value = "+A);
        }
        else if(B>A && B>C){
            System.out.println("Maximum Value = "+B);
        }
        else if(C>A && C>B){
            System.out.println("Maximum Value = "+C);
        }
    }

}
