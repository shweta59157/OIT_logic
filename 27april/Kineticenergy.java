import java.util.Scanner;
public class Kineticenergy{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the mass:");
        Double mass=sc.nextDouble();
        Double gravity=9.81;
        System.out.println("the gravity:"+gravity);
        System.out.println("Enter the height");
        Double height=sc.nextDouble();
        System.out.println("Enter the velocity");
        Double velocity=sc.nextDouble();
        Double potentialEnergy=mass*gravity*height;
        System.out.println("enter the potential energy:"+potentialEnergy);

        Double kineticenergy=0.5*mass*velocity*velocity;
        System.out.println("Enter the kinetic energy:"+kineticenergy);
    }
}