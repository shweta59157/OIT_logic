import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of second:");
        int second = sc.nextInt();
        int hours = second /3600;
        int min = (second % 3600)/60;
        int sec = ((second % 3600)%60);
        System.out.println("hours:"+hours);
        System.out.println("minutes:"+min);
        System.out.println("second:"+sec);

    }
}
