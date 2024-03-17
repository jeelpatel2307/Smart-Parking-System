import java.util.ArrayList;
import java.util.List;

class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;

    public ParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
        this.isOccupied = false;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        isOccupied = true;
    }

    public void vacate() {
        isOccupied = false;
    }
}

class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(int capacity) {
        spots = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            spots.add(new ParkingSpot(i));
        }
    }

    public boolean parkCar() {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                spot.occupy();
                System.out.println("Car parked at spot: " + spot.getSpotNumber());
                return true;
            }
        }
        System.out.println("Parking lot is full. Cannot park car.");
        return false;
    }

    public boolean vacateSpot(int spotNumber) {
        for (ParkingSpot spot : spots) {
            if (spot.getSpotNumber() == spotNumber && spot.isOccupied()) {
                spot.vacate();
                System.out.println("Spot " + spotNumber + " vacated.");
                return true;
            }
        }
        System.out.println("Spot " + spotNumber + " is already vacant or does not exist.");
        return false;
    }
}

public class SmartParkingSystem {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        // Park cars
        parkingLot.parkCar();
        parkingLot.parkCar();
        parkingLot.parkCar();
        parkingLot.parkCar();
        parkingLot.parkCar();

        // Try to park when parking lot is full
        parkingLot.parkCar();

        // Vacate spots
        parkingLot.vacateSpot(3);
        parkingLot.vacateSpot(2);
        parkingLot.vacateSpot(6); // Trying to vacate a non-existent spot
    }
}
