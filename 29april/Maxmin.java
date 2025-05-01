import java.util.Scanner;

public class Maxmin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(" a maximum is:");
        }else{
            System.out.println(" a minimum is:");
        }
    }
}