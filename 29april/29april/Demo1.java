import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter c:");
        int c = sc.nextInt();

        if(b>a&&a<c){
            System.out.println("a is between b and c");
        }else{
            System.out.println("a is not betwwen b and c");
        }
    }
}
