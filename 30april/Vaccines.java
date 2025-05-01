import java.util.Scanner;

public class Vaccines{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vaccines:");
        int vaccines = sc.nextInt();
        if(vaccines == 2){
            System.out.println("your eligible for interview:");
        }else{
            System.out.println("your not eligible for interview:");
        }
    }
}