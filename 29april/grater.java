import java.util.Scanner;

public class grater {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a:");
      int a = sc.nextInt();
      System.out.println("Enter b");
      int b = sc.nextInt();
      System.out.println("Enter c:");
      int c = sc.nextInt();
      if (a<b && b>c) {
         System.out.println(b+ "is between a and c");
      } else {
         System.out.println( b + "is not between a and c");
      }

   }
}
    

