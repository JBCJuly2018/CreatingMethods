import java.util.Scanner;

public class MowingApp {

    /*
    *
    * Bob has a lawn service business. Bob estimates that he can mow 40 sq yard of lawn in 2 minutes.
    * Write a program that allow Bob to enter the length and width of a lawn.
    * The program should then compute the square yardage and the time it will take to mow it.
    * Display the length, width, square yardage, and the amount of time to mow it.
    *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a lawn: ");
        int userLength = sc.nextInt();

        System.out.print("Enter the width of a lawn: ");
        int userWidth = sc.nextInt();

        int userArea = calculateArea(userLength, userWidth);
        double timeToMow = calculateTime(userArea);

        System.out.println("The time it takes to mow a " + userArea +
                " sq yard is: " + timeToMow + " minutes.");
    }

    public static int calculateArea(int length, int width) {
        int lawnArea = length * width;
        return lawnArea;
    }

    public static double calculateTime(int lawnArea) {
        double mowingTime = (lawnArea/40)*2;
        return mowingTime;
    }

}


