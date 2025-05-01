import java.util.Scanner;
public class Demo9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Double e,p,g=9.8;
        System.out.println("Enter the mass of body");
        int m = sc.nextInt();
        System.out.println("enter deplacement of body");
        int h = sc.nextInt();
        System.out.print("enter the velocity of body");
        int v=sc.nextInt();
        p=m*g*h;
        System.out.println("potential energy of body:"+p);        
        float k=m*v*v/2;
        System.out.println("kinetic energy of body:"+k);
        e=p+k;
        System.out.println("mechanical energy of body:"+e);

    }
}