import java.util.Objects;

public class Car {

  private boolean  engine;
  private int  cylinders;

  private String name;
  private int  wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){

        return "the car's engine is starting" +getClassName();
    }
    public String accelerate(){

       return "the car is accelerating" +getClassName();
    }
    public String brake(){

        return "the car is braking" + getClassName();
    }
    public String getClassName(){
        return "class: " + getClass().getSimpleName();
    }

    @java.lang.Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name=" + name +
                ", wheels=" + wheels +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Car car = (Car) object;
        return getCylinders() == car.getCylinders() && Objects.equals(getName(), car.getName());
    }
}
