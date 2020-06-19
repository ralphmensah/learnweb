package io.turntabl;

public class Car {
//    this
   private String color;
   private String model;
   private int speedLevel;

   public Car(String color, String model, int speedLevel){
       this.color = color;
       this.model = model;
       this.speedLevel = speedLevel;
   }

   public String getColor(){
       return this.color;
   }

   public String horn(){
       System.out.println("peeee...");
       return "peeep!!";
   }
   public void move(){
       System.out.println("moving...");
   }
}
