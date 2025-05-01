import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monthly sales value:");
        Double salesIncome = sc.nextDouble();
        double commisonrate = 0.03;
        if(salesIncome>1000000){
            System.out.println("your comission is:"+(salesIncome*commisonrate));

        }else{
            System.out.println("no comission:");
        }
    }
}
