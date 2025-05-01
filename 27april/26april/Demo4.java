import java.util.Scanner;
public class Demo4{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius=sc.nextInt();
        int area=3.14*radius*radius;
        System.out.println("area of circle is:"+area);
        int circum=2*3.14*radius;
        System .out.println("circum is :"+(circum));

    }
}