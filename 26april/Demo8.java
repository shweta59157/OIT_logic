import java.util.Scanner;
public class Demo8{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter principal,interestrate,time");
      Double principal =sc.nextDouble();
      Double interestrate = sc.nextDouble();
      int time = sc.nextInt();
      Double SI=(principal*interestrate*time)/100;
      System.out.println("simpla interest is:"+SI);
      Double A = principal*Math.pow(1+interestrate/100,time)-principal;
      System.out.println("compound interest is:"+A);
    }
}