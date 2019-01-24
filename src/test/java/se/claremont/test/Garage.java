package se.claremont.test;

public class Garage {
    Vehicle[] vehicles = new Vehicle[10];
    String address;

    public Garage(String address) {
        this.address = address;
    }

    public void parkVehicle(int place, Vehicle vehicle) {
        vehicles[place] = vehicle;
    }

    public Vehicle checkVehicle(int place) {
        return vehicles[place];
    }

    public int getNumberOfCarsWithValueOver(int price) {
        int numberOfCars = 0;

        for (int i = 0; i < vehicles.length; i++) {

            if (vehicles[i] != null && vehicles[i].getPrice() > price) {
                numberOfCars++;
            }
        }
        return numberOfCars;
    }

    }