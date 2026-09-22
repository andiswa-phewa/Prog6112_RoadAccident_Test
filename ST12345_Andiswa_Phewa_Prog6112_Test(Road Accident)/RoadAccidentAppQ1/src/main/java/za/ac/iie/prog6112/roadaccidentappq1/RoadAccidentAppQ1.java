/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package za.ac.iie.prog6112.roadaccidentappq1;

/**
 *
 * @author anphewa
 */
import java.util.Scanner;

public class RoadAccidentAppQ1 {

    // One-dimensional array containing the city names.
    private static final String[] cities = {
        "Cape Town",
        "Johannesburg",
        "Port Elizabeth"
    };

    // Two-dimensional array used to store accident figures.
    // Rows = cities
    // Column 0 = Car accidents
    // Column 1 = Motor bike accidents
    private static final int[][] accidents = new int[3][2];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Capture accident information for each city.
        for (int x = 0; x < cities.length; x++) {

            System.out.print("Enter the number of car accidents for "
                    + cities[x] + ": ");

            accidents[x][0] = scanner.nextInt();

            System.out.print("Enter the number of motor bike accidents for "
                    + cities[x] + ": ");

            accidents[x][1] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------");

        // Column headings
        System.out.println("CITY\t\tCAR\t\tMOTOR BIKE");

        // Display the accident information.
        for (int x = 0; x < accidents.length; x++) {

            // One tab is enough after each city name.
            System.out.print(cities[x] + "\t");

            System.out.print(accidents[x][0] + "\t\t");

            System.out.println(accidents[x][1]);
        }

        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        // Display total accidents for each city.
        for (int x = 0; x < cities.length; x++) {

            System.out.println(cities[x] + "\t"
                    + calculateTotal(x));
        }

        System.out.println();

        // Determine the city with the most accidents.
        int highestCity = determineHighestCity();

        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: "
                + cities[highestCity]);

        scanner.close();
    }

    // Calculates the total accidents for one city.
    private static int calculateTotal(int position) {

        int total = 0;

        for (int x = 0; x < accidents[position].length; x++) {

            total = total + accidents[position][x];
        }

        return total;
    }

    // Determines the city with the highest number of accidents.
    private static int determineHighestCity() {

        int highestPosition = 0;

        int highestTotal = calculateTotal(0);

        for (int x = 1; x < cities.length; x++) {

            int currentTotal = calculateTotal(x);

            if (currentTotal > highestTotal) {

                highestTotal = currentTotal;

                highestPosition = x;
            }
        }

        return highestPosition;
    }
}