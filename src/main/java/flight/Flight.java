package flight;

import crew.cabincrew.CabinCrew;
import crew.pilots.Pilot;
import passengers.Passenger;
import plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private ArrayList<Pilot> pilots;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;
//    private PlaneType planeType;

    public Flight(String flightNo, String departureAirport, String destination, String departureTime){
        this.flightNo = flightNo;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.departureTime = departureTime;
        this.cabinCrew = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.pilots = new ArrayList<Pilot>();
//        this.planeType = plane;
    }

    public String getFlightNo(){
        return flightNo;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public int passengerList(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int cabinCrewList(){
        return this.cabinCrew.size();
    }

    public void addCabinCrew(CabinCrew cabinCrew){
        this.cabinCrew.add(cabinCrew);
    }

}
