import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:");
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();
        Double d = sc.nextDouble();
        Double AM = a+b+c+d/4;
        System.out.println("Arithmetic mean:"+AM);
    }
}