public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @java.lang.Override
    public String startEngine() {
        return "Holden's engine is starting" +getClassName();
    }

    @java.lang.Override
    public String accelerate() {return "Holden is accelerating" +getClassName();
    }

    @java.lang.Override
    public String brake() {
        return "Holden is braking" +getClassName();
    }
}
