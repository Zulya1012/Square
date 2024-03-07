import java.util.Scanner;
public class MathSquare {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Input a positive integer: ");
    int a = s.nextInt();

    if (a < 0) {
      System.out.println("Enter a positive integer");
      return;
    }

    double square = Math.sqrt(a);
    System.out.println(square);
  }
}
