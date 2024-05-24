import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //  program does this 
        System.out.println("this program that calculates the fuel cost per 100 miles and how far the car can go with a full tank of gas.");
        
        // ask user number of gallons in the tank
        System.out.print("the number of gallons of gas in the tank: ");
        double gallonsInTank = scanner.nextDouble();
        
        // Prompting for the fuel efficiency
        System.out.print("the fuel efficiency in miles per gallon: ");
        double fuelEfficiency = scanner.nextDouble();
        
        // Prompting for the price per gallon
        System.out.print(" the price of gas per gallon: ");
        double pricePerGallon = scanner.nextDouble();
        
        // Calculate the cost per 100 miles
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        
        // Calculate the maximum distance the car can travel on a full tank
        int maxDistance = (int) (gallonsInTank * fuelEfficiency);
        
        // Display the results
        System.out.printf("Cost per 100 miles: $%.2f\n", costPer100Miles);
        System.out.println("Maximum distance on a full tank: " + maxDistance + " miles");
        
        // Close the scanner
        scanner.close();
    }
}
