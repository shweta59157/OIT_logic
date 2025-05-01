import java.util.Scanner;
public class Demo5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius=sc.nextInt();
        Double area = 4*3.14*radius*radius;
        System.out.println("area of sphere:"+area);

    }
    }
