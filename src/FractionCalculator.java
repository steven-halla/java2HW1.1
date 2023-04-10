import java.util.Scanner;

public class FractionCalculator {

    {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Your Numerator : ");
        int numerator = input.nextInt();
        System.out.print("Input Your  Denominator: ");
        int denominator = input.nextInt();
        input.close();

        if (denominator == 0) {
            System.out.println("No infinity allowed, you can't break my computer.");
        } else {

            if (numerator < denominator) {
                System.out.println("This is a proper fraction.");
            } else {

                System.out.println("This is an improper fraction.");
                int dividedNumber = numerator / denominator;
                int remainder = numerator % denominator;

                if (remainder == 0) {
                    System.out.println("The simplified fraction is: " + dividedNumber);
                } else {

                    System.out.println("The mixed fraction is: " + dividedNumber + " + " + remainder + " / " + denominator);
                }
            }
        }
    }

    public static void main(String[] args) {
        new FractionCalculator();
    }
}
