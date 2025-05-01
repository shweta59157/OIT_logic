import java.util.Scanner;
public class Distance{
    public static void main(String args [])
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the value is 4 cordinate:");
          int x1=sc.nextInt();
          int x2=sc.nextInt();
          int y1=sc.nextInt();
          int y2=sc.nextInt();
          int distance=x1-x2;
          int distance1=y1-y2;
          System.out.println("distance between"+x1+"and"+x2+"is:"+distance );
          System.out.println("distance between"+y1+"and"+y2+"is:"+distance1 );

    }
}