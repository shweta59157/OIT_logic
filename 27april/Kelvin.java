import java.util.Scanner;

public class Kelvin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celcius value:");
        Double Kelvin = sc.nextDouble();
        Double Convert = (Kelvin-273.15);
        System.out.println("Converted value of celcius to kelvin:"+Convert);

    }
}
