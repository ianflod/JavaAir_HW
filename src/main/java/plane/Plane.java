package plane;

public class Plane {

    private PlaneType planeType;
    private int capacity;
    private int weight;

    public Plane(PlaneType planeType, int capacity, int weight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getStringFromEnum(){
        return this.planeType.getValue();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }

}
