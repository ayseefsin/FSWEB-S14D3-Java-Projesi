public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @java.lang.Override
    public String startEngine() {
        return "Ford's engine is starting" +getClassName();
    }

    @java.lang.Override
    public String accelerate() {
        return "Ford is accelerating " +getClassName();
    }

    @java.lang.Override
    public String brake() {
        return "Ford is braking " +getClassName();
    }
}
