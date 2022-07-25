package crew;

public enum RankType {
    CAPTAIN("Captain"),
    FIRST_OFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHT_ATTENDENT("Flight Attendent");

    private String value;

    RankType(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
