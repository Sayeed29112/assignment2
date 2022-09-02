import java.util.Scanner;
public class Num6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks you got : ");
        int marks = sc.nextInt();
        if (marks >= 80)
            System.out.print("Your got A+ grade\nYour grade pont is 4.00\nRemarks : Outstanding");
        else if (marks < 80 && marks >= 75)
            System.out.print("Your got A  grade\nYour grade pont is 3.75\nRemarks : Excellent");
        else if (marks < 75 && marks >= 70)
            System.out.print("Your got A- grade\nYour grade pont is 3.50\nRemarks : Very Good");
        else if (marks < 70 && marks >= 65)
            System.out.print("Your got B+ grade\nYour grade pont is 3.25\nRemarks : Good");
        else if (marks < 65 && marks >= 60)
            System.out.print("Your got B  grade\nYour grade pont is 3.00\nRemarks : Satisfactory");
        else if (marks < 60 && marks >= 55)
            System.out.print("Your got B- grade\nYour grade pont is 2.75\nRemarks : Above Average");
        else if (marks < 55 && marks >= 50)
            System.out.print("Your got C+ grade\nYour grade pont is 2.50\nRemarks : Average");
        else if (marks < 50 && marks >= 45)
            System.out.print("Your got C  grade\nYour grade pont is 2.25\nRemarks : Bellow Average");
        else if (marks < 45 && marks >= 40)
            System.out.print("Your got D  grade\nYour grade pont is 2.00\nRemarks : Pass");
        else System.out.print("Your got F  grade\nYour grade pont is 0.00\nRemarks : Fail");

    }
}
