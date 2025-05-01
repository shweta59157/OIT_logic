import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int num = sc.nextInt();
        if(num%4==0) {
            System.out.println(num + "is leaf year");
        }else{
            System.out.println(num +"is not leaf year");
          
     }
    
    }
}

