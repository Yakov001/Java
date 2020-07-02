import java.util.Scanner;

public class ToiletRoll {
    public static void main (String [] args){
        double coreRadius, maxRadius, thickness;
        System.out.print("Enter coreRadius: ");
        Scanner keyboard = new Scanner( System.in);
        coreRadius = keyboard.nextInt();
        System.out.print("Enter maxRadius: ");
        maxRadius = keyboard.nextInt();
        System.out.print("Enter thickness: ");
        thickness = keyboard.nextInt();
        System.out.println(FastLen(coreRadius, maxRadius, thickness));
        System.out.println(LenWithFor(coreRadius, maxRadius, thickness));

    }

    public static double LenWithFor(double coreRadius, double maxRadius, double thickness){
        double summ = coreRadius;
        for (int round = 1; round <= ((maxRadius - coreRadius)/thickness); round ++){
            summ += thickness * round;

        }
        return 2 * Math.PI * summ;
    }

    public static double FastLen(double coreRadius, double maxRadius, double thickness){
        double maxround = (int) Math.floor((maxRadius- coreRadius)/thickness);
        return 2 * Math.PI * (2* coreRadius + thickness * maxround)/2 * (maxround+1);
    }
}
