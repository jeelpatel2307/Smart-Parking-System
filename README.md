### Smart Parking System

This project is a basic implementation of a Smart Parking System in Java. It provides functionality to manage parking spots within a parking lot.

### Features:

- **ParkingSpot**: Represents a parking spot with attributes such as spot number and occupancy status.
- **ParkingLot**: Manages a list of parking spots and provides methods to park and vacate cars.
- **SmartParkingSystem**: Demonstrates the usage of the parking lot by parking and vacating cars.

### How to Use:

1. Create a `ParkingLot` object with a specified capacity.
2. Park cars using the `parkCar()` method.
3. Vacate parking spots using the `vacateSpot()` method.

### Usage Example:

```java
public class SmartParkingSystem {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5);

        // Park cars
        parkingLot.parkCar();
        parkingLot.parkCar();
        parkingLot.parkCar();

        // Vacate spots
        parkingLot.vacateSpot(3);
        parkingLot.vacateSpot(2);
    }
}

```

### Note:

- This is a basic implementation and can be extended to include additional features such as payment processing, reservation system, and real-time availability updates.
