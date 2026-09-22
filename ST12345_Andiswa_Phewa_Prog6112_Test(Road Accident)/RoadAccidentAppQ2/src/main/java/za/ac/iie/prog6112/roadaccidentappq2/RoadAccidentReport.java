/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.roadaccidentappq2;

/**
 *
 * @author anphewa
 */
public class RoadAccidentReport extends RoadAccidents {

    /*
     * Constructor for RoadAccidentReport.
     *
     * super() sends the values to the constructor
     * in the RoadAccidents superclass.
     */
    public RoadAccidentReport(String vehicleType,
                              String city,
                              int accidentTotal) {

        super(vehicleType, city, accidentTotal);
    }

    /*
     * This method prints the accident report.
     *
     * We use the getter methods inherited
     * from the RoadAccidents class.
     */
    public void printAccidentReport() {

        System.out.println();
        System.out.println("************************");
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("************************");

        System.out.println("VEHICLE TYPE: "
                + getAccidentVehicleType());

        System.out.println("CITY: "
                + getCity());

        System.out.println("ACCIDENT TOTAL: "
                + getAccidentTotal());

        System.out.println("************************");
    }
}