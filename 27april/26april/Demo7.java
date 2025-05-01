import java.util.Scanner;
public class Demo7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five suubject marks");
        int maths=sc.nextInt();
        int english=sc.nextInt();
        int marathi=sc.nextInt();
        int science=sc.nextInt();
        int hindi=sc.nextInt();
        int total=maths+english+marathi+science+hindi;
        System.out.println("total"+total);
        int per=(total/5)*100;
        System.out.println("percentage"+per);

    }
}