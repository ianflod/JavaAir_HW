package plane;

public enum PlaneType {
    AIRBUS_A380("Airbus A380"),
    BOEING_787("Boeing 787");
//    LEARJET_A30("Learjet A30"),

    private String value;


    PlaneType(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

}
