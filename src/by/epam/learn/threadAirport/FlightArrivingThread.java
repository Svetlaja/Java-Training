package by.epam.learn.threadAirport;

public class FlightArrivingThread extends Thread {
    int gateArrival;

    public FlightArrivingThread(int gateArrival, String destination) {
        this.gateArrival = gateArrival;
        setName(destination);
    }

    @Override
    public void run() {
        String nameFl = getName();
        System.out.println("Arrival Gate#" + gateArrival + ":-" + nameFl + ", Status: " + "On");
        System.out.println("Arrival Gate#" + gateArrival + ":-" + nameFl + ", Status: " + "Off");
    }
}