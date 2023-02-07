import java.util.Scanner;

public class findLastDigit {

  public static void main(String args[]) {
    int num;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a num: ");
    num = in.nextInt();
    System.out.println(Math.abs(num%10));
  }
}
