import java.util.Scanner;
public class Num8 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a integer number : ");
        int num=Sc.nextInt();
        int op=1;
        for(int i=1; i<=10; i++)
        {
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
