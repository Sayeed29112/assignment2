import java.util.Scanner;
public class Num10 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Test Case = ");
        int t=Sc.nextInt();
        int n;
        for(int i=0; i<t; i++)
        {
            System.out.print("Enter a number :");
            n=Sc.nextInt();
            int flag=1;
            for(int j=2; j<=Math.sqrt(n); j++)
            {
                if(n%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.println(n+" is a Prime number");
            else System.out.println(n+" is not a Prime number");
        }

    }
}
