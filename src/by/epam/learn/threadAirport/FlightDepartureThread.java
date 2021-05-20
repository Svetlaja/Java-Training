package by.epam.learn.threadAirport;

public class FlightDepartureThread extends Thread {
    public int gateDepart;

    public FlightDepartureThread(int gateDepart, String destination) {
        super();
        this.gateDepart = gateDepart;
        setName(destination);
    }
    public void run() {
        String nameFl = getName();
        System.out.println("Gate#" +gateDepart +":-" + nameFl + ", Status: " + "Boarding is on");
        System.out.println("Gate#" +gateDepart +":-" + nameFl + ", Status: " + "Boarding is closed.");
    }
}
