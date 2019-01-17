package se.claremont.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    @Test
    public void changeOwnerOfVehicle(){

        Vehicle myVehicle = new Vehicle( "Ford", "Focus");
        myVehicle.changeOwnership( "Gurra");
        assertEquals("Gurra",myVehicle.getOwner());

    }


    @Test
    public void parkCarInGarage(){
        Vehicle myVehicle = new Vehicle( "Ford", "Focus");
        Garage myGarage = new Garage("Stor gatan");

        myGarage.parkVehicle(2, myVehicle);
        Vehicle myVehicleAgain = myGarage.checkVehicle(2);
        assertEquals(myVehicle, myVehicleAgain);
    }

    @Test
    public void getNumberOfExpensiveVehicles(){
        Garage myGarage = new Garage("Storgatan");
        Vehicle myVehicle = new Vehicle("Volvo", "v40");
        myVehicle.setPrice(1100);
        myGarage.parkVehicle(2, myVehicle);

        assertEquals(1, myGarage.getNumberOfCarsWithValueOver(1000)

        );
    }



}
