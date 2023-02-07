import java.util.Scanner;

public class sum {

  public static void main(String args[]) {
    int num1,num2;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    num1 = in.nextInt();
    num2 = in.nextInt();
    int first = num1%10;
    int sec = num2%10;
    int sum=first+sec;
    System.out.println("sum of last digits = " +sum);
  }
}
