import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10th Mark:");
        int tenth= sc.nextInt();
        System.out.println("Enter the 12th mark: ");
        int twelth = sc.nextInt();
        System.out.println("Enter the graduation marks:");
        int graduation = sc.nextInt();

        if(tenth>=60){
            if(twelth>=60){
                if(graduation>=60){
                    System.out.println("Eligible for interview");
                }else{
                    System.out.println("Not eligible for interview deu to low graduation marks:");
                }
            }else{
                System.out.println("Not eligible for interview due to low 12th marks");
            }
        }else{
            System.out.println("Not eligible for interview due to low 10th marks");
        }

    }
}
