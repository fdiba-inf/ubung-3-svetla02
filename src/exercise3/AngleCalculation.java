package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter angle: ");
       char ch = input.next().charAt(0);
       double Pi = Math.PI;
       double angle;
       do {
         angle = input.nextDouble();
          ch = input.next().charAt(0);
         if(ch == 'r') {
           double conangle = angle / Math.PI * 180;
           System.out.println("Angle: " + conangle + ch);
         } else {
           double conangle = angle * Math.PI / 180;
           System.out.println("Angle: " + conangle+ ch);
         }
         ch = input.next().charAt(0);


       } while((ch == 'r') || (ch == 'd'));
       
       
    }

}
