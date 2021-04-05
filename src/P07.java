import java.util.Scanner;

public class P07 {
    //Program to Check Whether a Number is Even or Odd
    public static void main(String[] args) {

        Scanner srcreader  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = srcreader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
