import java.util.Scanner;

public class IsOdd {

  public static void main(String argts[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();
    if (num % 2 != 0) System.out.println("2"); 
    else System.out.println("1");
  }
}
