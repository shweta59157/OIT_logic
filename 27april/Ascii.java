import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        char ascii = (char)num;
        System.out.println("Ascii value of given number :"+ascii);
    }
}
