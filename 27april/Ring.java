import java.util.Scanner;
public class Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter outer radius:");
        Double OR = sc.nextDouble();
        System.out.println("Enter Inner radius:");
        Double IR = sc.nextDouble();
        double area = (OR*OR*-IR*IR);
        Double perimeter = 2*3.14*(OR*IR);
        System.out.println("surface of Ring:"+area);
        System.out.println("perimeter of ring:"+perimeter);
    }
}
