import java.util.Scanner;

public class cubide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght width and breadth");
        Double l=sc.nextDouble();
        Double w=sc.nextDouble();
        Double h=sc.nextDouble();
        Double area=2*(l*w*l*h*w*h);
        Double volume=l*w*h;
        System.out.println("Surface of ring:"+area);
        System.out.println("perimeter of Ring:"+volume);
    }
}
