import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X Qudrant:");
        int x = sc.nextInt();
        System.out.println("Enter Y Qudrant: ");
        int y = sc.nextInt();
        if(x>0 && y>0){
            System.out.println("given no is I-Qudrant");
        }else if(x<0 && y>0){
            System.out.println("given no is in II-Qudrant");
        }else if(x<0 && y<0){
            System.out.println("given no  is in III-Qudrant");
        }else if(x>0 && y<0){
            System.out.println("given no is in IV-Qudrant");
        }
    }
}
