package se.claremont.test;

public class Vehicle {

   private String make;
   private String model;
   private String owner;
   public int price;
   public int location;

   public Vehicle(String make, String model){
       this.make = make;
       this.model = model;

   }

    public int getLocation() { return location;}

    public int setLocation(){ return location;}

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
       this.price = price;
   }

    public void changeOwnership(String newOwner){
        owner = newOwner;
    }

    public String getOwner(){
        return owner;
    }



}
