
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
     int icNo;

     Person(String name, int ic) {
         this.name = name;
         this.icNo = ic;
     }
 }
 class CarRegNode {
     int regNo;
     Car regCar;
     Person owner;

     CarRegNode(int regNo, Car regCar, Person owner) {
         this.regCar = regCar;
         this.owner = owner;
         this.regNo = regNo;
     }

     public addCar() {

     }
 }

 public class P4Q5 {
     public static void main(String[] args) {
         CarRegNode[] reglist = new CarRegNode[50];

     }
 }
