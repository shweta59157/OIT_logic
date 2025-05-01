import java.util.Scanner;

public class Threesubject {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks for subject 1:");
    int subject1marks = sc.nextInt();
    
    System.out.println("Enter marks for subject 2:");
    int subject2marks = sc.nextInt();

    System.out.println("Enter marks for subject 3:");
    int subject3marks = sc.nextInt();

    int totalmarks = subject1marks+subject2marks+subject3marks;
    System.out.println("Totalmarks:" + totalmarks);
    double percentage = (double) totalmarks/3;
    System.out.println("Percentage:" +percentage+"%");

    if(percentage>= 60){
      System.out.println("division first class");
    }else if(percentage>= 50){
      System.out.println("division second class");
    }else if(percentage>= 40){
      System.out.println("division third class");
    }else{
      System.out.println("Fail");
    }

   } 
}
