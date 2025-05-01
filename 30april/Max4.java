import java.util.Scanner;

public class Max4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c,d");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc. nextInt();
        int d = sc.nextInt();
        if(a>=b)
        {
            if(a>=c){
                if(a>=d){
                    System.out.println(a+"is smaller");
                }else{
                    System.out.println(d+"is smaller");
                }
            }
            else{
                if(c>=d){
                    System.out.println("c is grater");
                }else{
                    System.out.println("d is grater");
                }
            }
        }else{
            if(b>=c){
                if(b>=d){
                    System.out.println(b+"is grater");
                }

            else{
                System.out.println(d+"is grater");
            }
        }else{
                if(c>=d){
                    System.out.println(c+"is grater");
                }else{
                    System.out.println(d+"is grater");
                }
            }

        }
    }
}

