import java.util.Scanner;

public class WithholdingCal {
    public static void main(String[] args) {
        // scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // user enters in their income and it is assigned to income variable
        System.out.print("Please enter your weekly income here: ");
        double income = scanner.nextDouble();

        // init tax rate variable as null -after else if block, correct value will be assigned
        // type double as it is a floating point number
        double taxRate;

        // else if block to determine and assign correct value to taxRate
        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // do the calculations
        double withholding = income * taxRate;

        // output and format the results the results
        System.out.printf("Your weekly tax withholding is: $%.2f%n", withholding);

        // close scanner and end program
        scanner.close();
    }
}
