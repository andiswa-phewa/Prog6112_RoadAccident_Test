/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.roadaccidentappq2;

/**
 *
 * @author anphewa
 */
public abstract class RoadAccidents implements IRoadAccidents {

    // Variables used to store the accident information.
    private String vehicleType;
    private String city;
    private int accidentTotal;

    /*
     * Constructor.
     *
     * The constructor receives the vehicle type,
     * city and accident total.
     */
    public RoadAccidents(String vehicleType,
                         String city,
                         int accidentTotal) {

        this.vehicleType = vehicleType;

        this.city = city;

        this.accidentTotal = accidentTotal;
    }

    /*
     * This method comes from the IRoadAccidents interface.
     * It returns the vehicle type.
     */
    @Override
    public String getAccidentVehicleType() {

        return vehicleType;
    }

    /*
     * Returns the city where the accidents occurred.
     */
    @Override
    public String getCity() {

        return city;
    }

    /*
     * Returns the total number of accidents.
     */
    @Override
    public int getAccidentTotal() {

        return accidentTotal;
    }
}