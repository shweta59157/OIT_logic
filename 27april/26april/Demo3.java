import java.util.Scanner;
public class Demo3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter square of side");
        int side=sc.nextInt();
        int area=side*side;
        System.out.println("area of square is:"+area);
        int perimeter=4*side;
        System .out.println("perimeter is :"+(perimeter));

    }
}