public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        CarSkeleton gas = new GasPoweredCar("aysin","mük",100,5);
        CarSkeleton electric = new ElectricCar("zeus","fast",120.00,100);
        CarSkeleton hybrid = new HybridCar("hades","good", 140,80,4);
        System.out.println("gas: " + gas.getName()+" " + gas.drive());
        System.out.println("electric: " + electric.startEngine());
        System.out.println("hybrid: " + hybrid.startEngine());
    }
}