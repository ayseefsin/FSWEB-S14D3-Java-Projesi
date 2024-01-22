public class Mitsubishi extends Car{


    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @java.lang.Override
    public String startEngine() {
        return "Mitsubishi's engine is starting" +getClassName();
    }

    @java.lang.Override
    public String accelerate() {
        return "Mitsubishi is accelerating" +getClassName();
    }

    @java.lang.Override
    public String brake() {
        return "Mitsubishi is braking" +getClassName();
    }
}
