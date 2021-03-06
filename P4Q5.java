
class Car {
     String plateNo;
     String color;
     int yearManufactured;
     String make;
     String model;
     double capacity;

     Car(String pn, String clr, int y, String mk, String md, double caps) {
         this.plateNo = pn;
         this.color = clr;
         this.yearManufactured = y;
         this.make = mk;
         this.model = md;
         this.capacity = caps;
     }
 }
 class Person {
     String name;
     String icNo;

     Person(String name, String ic) {
         this.name = name;
         this.icNo = ic;
     }
 }
 class CarRegister {
     static int indexer = 1000;
     int regNo;
     Car regCar;
     Person owner;

     /*CarRegNode(int regNo, Car regCar, Person owner) {
         this.regCar = regCar;
         this.owner = owner;
         this.regNo = regNo;
     }*/
     CarRegister() {
         this.regNo = ++indexer;
     }

     public void setOwner(String name, String ic) {
         if(ic.matches("[0-9]+") && ic.length() == 12) this.owner = new Person(name, ic);
     }
     public void setCar(String pn, String clr, int y, String mk, String md, double caps) {
         this.regCar = new Car(pn,clr,y,mk,md,caps);
     }
 }

 public class P4Q5 {
     public static void main(String[] args) {
         CarRegister[] reglist = new CarRegister[50];
         reglist[0] = new CarRegister();
         reglist[0].setOwner("Hohenheim", "956622115545");
         reglist[0].setCar("SS 5557 K", "White", 2013, "Toyota", "Vigo", 3.5);

         reglist[1] = new CarRegister();
     }
 }
