import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=c){
            if(a<=c){
                System.out.println("a is grater");
            }else{
                System.out.println("c is grater");
            }
        }
        else{
            System.out.println("b is grater");
        }
    }
}

