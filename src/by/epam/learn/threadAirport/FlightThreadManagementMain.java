package by.epam.learn.threadAirport;

public class FlightThreadManagementMain {

    public static void main(String[] args) throws InterruptedException{
        FlightDepartureThread destin1 = new FlightDepartureThread(1,"HEATHROW (Great Britain)");
        FlightDepartureThread destin2 = new FlightDepartureThread(2,"LOTNISKA CHOPINA (Poland)");
        FlightDepartureThread destin3 = new FlightDepartureThread(3,"CANBERRA AIRPORT (Australia)");
        FlightDepartureThread destin4 = new FlightDepartureThread(4,"OTTAWA AIRPORT (Canada)");
        FlightArrivingThread dest1 = new FlightArrivingThread(1, "HEATHROW (Great Britain)");
        FlightArrivingThread dest2 = new FlightArrivingThread(2, "LOTNISKA CHOPINA (Poland)");
        FlightArrivingThread dest3 = new FlightArrivingThread(3, "CANBERRA AIRPORT (Australia)");
        FlightArrivingThread dest4 = new FlightArrivingThread(4,"OTTAWA AIRPORT (Canada)");
        destin1.start();
        destin2.start();
        destin3.start();
        destin4.start();
        dest1.start();
        dest2.start();
        dest3.start();
        dest4.start();
    }
}