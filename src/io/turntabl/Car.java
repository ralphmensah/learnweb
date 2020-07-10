package io.turntabl;

public class Car {
//    this
   private String type;
   private String model;
   private int speedLevel;

   public Car(String color, String model, int speedLevel){
       this.type = color;
       this.model = model;
       this.speedLevel = speedLevel;
   }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getSpeedLevel() {
        return speedLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + type + '\'' +
                ", model='" + model + '\'' +
                ", speedLevel=" + speedLevel +
                '}';
    }
}
