import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        if(a>b) {
            System.out.println(a+ "is max "+b);
        }else{
            System.out.println(b+"is max"+a);
          
     }
    
    }
}

