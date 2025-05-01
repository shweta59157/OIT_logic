import java.util.Scanner;
public class Surfacearea{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int rad=sc.nextInt();
        System.out.println("Enter the height:");
        int height=sc.nextInt();
        Double surfacearea=2*3.14*rad*(rad+height);
        System.out.println("the surface area of cylinder:"+surfacearea);
    }
}