import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double cel;
        double far;
        String trash ;

        do {
            System.out.print("Enter your Temperature in Celsius: ");

            if (in.hasNextDouble()) {
                cel = in.nextDouble();
                in.nextLine();
                far = (cel * 1.8) + 32;
                System.out.println("Your temperature in Fahrenheit is " + far + " Degrees");
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a proper input");
            }
        } while(!done);
    }
}