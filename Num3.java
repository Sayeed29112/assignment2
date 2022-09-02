import java.util.Scanner;
public class Num3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name, dept;
        char sec;
        int age;
        double cgpa;
        System.out.println("Enter Your Name: ");
        name=input.nextLine();
        System.out.println("Enter Your Age: ");
        age=input.nextInt();
        System.out.println("Enter Your CGPA: ");
        cgpa=input.nextDouble();
        input.nextLine();
        System.out.println("Enter Your Department Name: ");
        dept=input.nextLine();
        System.out.println("Enter Your Section: ");
        sec=input.next().charAt(0);

        System.out.println("Your Name is "+name);
        System.out.println("Your Age is "+age);
        System.out.println("Your CGPA is "+cgpa);
        System.out.println("Your Department Name is "+dept);
        System.out.println("Your Section is "+sec);
    }
}
