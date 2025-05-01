import java.util.Scanner;
public class cities{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance betweem two cities in:");
        Double city1=sc.nextDouble();
        Double city2=sc.nextDouble();
        Double distance=city2-city1;
        Double convert=Distance*1000;
        Double convert1=Distance*10000;
        System.out.println("convert distance meter in:"+convert);
        System.out.println("convert distance cmeter in:"+convert1);

    }
    }