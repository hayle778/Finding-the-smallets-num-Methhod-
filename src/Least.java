import java.util.Scanner;

public class Least {

  public static void main(String[] args) {
   int smallestInt;
    int a, b, c;
    int SV;
    Scanner input = new Scanner(System.in);
    System.out.println("Input a:");
    a = input.nextInt();
    System.out.println("Input b:");
    b = input.nextInt();
    System.out.println("Input c:");
    c = input.nextInt();
    //System.out.println("The smallest number:" );
  // calling the method
    smallestInt( a, b, c);
  }
  static void smallestInt(int a, int b, int c) { // method definition

    if (a < b && a < c) {
      System.out.println("The smallest number is a which is " + a);
    } else if (b < c && b <a) {
      System.out.println("The smallest number is b which is " + b);
    } else {
      System.out.println("The smallest number is c  which is  " + c);
    }

  }

}




