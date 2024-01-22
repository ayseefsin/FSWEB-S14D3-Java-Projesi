public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String startEngine(){
        return  getName() + "'s engine start";
    };
    public String drive(){
        runEngine(this);
        return this.getName() + "driving";
    };
    protected String runEngine(CarSkeleton carSkeleton){
        return this.getName()+ "'s engine run ";
    };

}
