/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.roadaccidentappq2;

/**
 *
 * @author anphewa
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for the vehicle type.
        System.out.print("Enter the accident vehicle type: ");

        String vehicleType = scanner.nextLine();

        // Ask the user for the city.
        System.out.print("Enter the city for the vehicle accidents: ");

        String city = scanner.nextLine();

        // Ask the user for the total number of accidents.
        System.out.print("Enter the total accidents for "
                + vehicleType + ": ");

        int accidentTotal = scanner.nextInt();

        /*
         * Create a RoadAccidentReport object.
         *
         * We pass the vehicle type, city and accident total
         * to the constructor.
         */
        RoadAccidentReport report =
                new RoadAccidentReport(
                        vehicleType,
                        city,
                        accidentTotal
                );

        // Call the method that prints the report.
        report.printAccidentReport();

        scanner.close();
    }
}