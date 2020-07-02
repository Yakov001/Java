import java.util.Scanner;

public class ToiletRoll {
    public static void main (String [] args){
        double coreRadius;
        double maxRadius;
        double thickness;
        double length;
        Scanner keyboard = new Scanner( System.in);
        coreRadius = keyboard.nextInt();
        maxRadius = keyboard.nextInt();
        thickness = keyboard.nextInt();
        double summ = coreRadius;
        for (int round = 1; round <= ((maxRadius - coreRadius)/thickness); round ++){
            summ += thickness * round;

        }
        length = 2 * Math.PI * summ;
        System.out.println(length);

    }
}
